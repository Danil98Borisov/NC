package zoo.model;

import zoo.ParserCommand;
import zoo.Zoo;
import zoo.model.speciesAnimals.Species;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Species> list = new ArrayList<Species>();
            System.out.println("Команды:");
            System.out.println("check-in species name");
            System.out.println("check-out species name");
            System.out.println("log - вывод логов");
            System.out.println("go-out - выход");

        ParserCommand parserCommand = new ParserCommand();
        parserCommand.getResult();
    }
}
