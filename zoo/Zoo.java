package zoo;

import zoo.model.animal.InterAnimal;
import zoo.model.speciesAnimals.Species;
import zoo.model.cage.Cage;
import zoo.model.condition.Condition;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Zoo implements InterZoo {

    Logger logger = new Logger();
    Map<String, Cage> zoo = new HashMap<>();//клетка и какое животное там живет

    List<Cage> cages;//клетки
    List<Condition> condition;//список расс которые могут жить в i-ой клетке

    public Zoo(int size) throws IOException {
        cages = new ArrayList<>();
        condition = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String s = Files.readAllLines(Paths.get("D:\\Java\\Zoo\\Zoo.txt")).get(i + 1);
            condition.add(new Condition(readConditions(s)));
            cages.add(new Cage(i + 1, 15, condition.get(i), true));
        }
    }

    @Override
    public void checkInAnimal(InterAnimal animal) {
        boolean flag = true;
        for (Cage cage : cages) {
            if ((cage.isVacantCage()) && (cage.getCondition().isAvailableFor().contains(animal.getSpecies()))) {
                cage.setVacantCage(false);
                zoo.put(animal.getName(), cage);
                break;
            } else {
                flag = false;

            }
        }
        if (flag) {
            System.out.println("Зверь в клетке");
            logger.addLogIn(animal, "Success");
        } else {
            System.out.println("Нельзя поселить");
            logger.addLogIn(animal, "No success");
        }
    }

    @Override
    public void checkOutAnimal(InterAnimal animal) {
        boolean flag = true;
        if (zoo.containsKey(animal.getName())) {
            zoo.get(animal.getName()).setVacantCage(true);
            zoo.remove(animal.getName());
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("Выселен");
            logger.addLogOut(animal, "Success");
        } else {
            System.out.println("Не выселен");
            logger.addLogOut(animal, "No success");
        }
    }


    @Override
    public List<InhibitionLog> getHistory() {
        return logger.getLogs();
    }


    public List<Species> readConditions(String word) throws IOException {
        List<Species> result = new ArrayList<>();
        String[] words = word.split(" ");
        for (String s : words) {
            result.add(Species.getSpecies(s));
        }
        return result;
    }

}
