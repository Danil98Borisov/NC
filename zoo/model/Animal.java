package zoo.model.animal;

import zoo.model.speciesAnimals.Species;

public class Animal implements InterAnimal {
    private final String name;
    private final Species species;

    public Animal(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Species getSpecies() {
        return species;
    }
}
