package zoo.model.speciesAnimals;

import java.io.IOException;

public enum Species {
    LEON, GIRAFFE, SQUIRREL, PENGUIN;

    public static Species getSpecies(String name) throws IOException {
        Species species = null;

        switch (name.toUpperCase()) {
            case ("LEON"):
                    species = Species.LEON;
                    break;
            case ("GIRAFFE"):
                species = Species.GIRAFFE;
                break;
            case ("SQUIRREL"):
                species = Species.SQUIRREL;
                break;
            case ("PENGUIN"):
                species = Species.PENGUIN;
                break;
        }
        if (species == null) {
            throw new IOException("Неправильно! ");
        }
        return species;
    }
}