package zoo;

import zoo.model.speciesAnimals.Species;
import zoo.model.animal.СreateZoo;


import java.io.IOException;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ParserCommand {

    СreateZoo сreateZoo = new СreateZoo();
    Zoo zoo = new Zoo(Integer.parseInt(Files.readAllLines(Paths.get("D:\\Java\\Zoo\\Zoo.txt")).get(0)));
    Scanner keyboard = new Scanner(System.in);

    public ParserCommand() throws IOException {
    }

    public void getResult() throws IOException {
        while (true) {
            String command = keyboard.nextLine();
            String[] word = command.split("\\s");
            String c = word[0];
            switch (c) {
                case "check-in":
                {
                    try {
                        Species.getSpecies(word[1]);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                        getResult();
                    }
                    zoo.checkInAnimal(сreateZoo.createAnimal(Species.getSpecies(word[2]), word[3]));
                }
                case "check-out":
                {
                    try {
                        Species.getSpecies(word[1]);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                        getResult();
                    }
                    zoo.checkOutAnimal(сreateZoo.createAnimal(Species.getSpecies(word[2]), word[3]));
                }
                case "log":
                    log(zoo.getHistory());
                case "go-out":
                    System.exit(0);
                default:
                    System.out.println("Неправильная команда. Попробуйте снова.");
            }
        }
    }


    public void log(List<InhibitionLog> inhibitionLogs) {
        for (InhibitionLog inhibitionLog : inhibitionLogs) {
            System.out.print(inhibitionLog);
        }
    }

}
