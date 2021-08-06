package zoo.model.animal;

import zoo.model.animal.InterAnimal;
import zoo.model.speciesAnimals.*;


public class СreateZoo {

    public InterAnimal createAnimal (Species species, String name) {
        InterAnimal InterAnimal = null;
        switch (species) {
            case LEON:
                InterAnimal = new Leon(name, species);
            case GIRAFFE:
                InterAnimal = new Giraffe(name, species);
            case SQUIRREL:
                InterAnimal = new Squirrel(name, species);
            case PENGUIN:
                InterAnimal = new Penguin(name, species);
        };
        return InterAnimal;
    }

}