package zoo.model.condition;

import zoo.model.speciesAnimals.Species;

import java.util.List;

public interface InterCondition {
    List<Species> isAvailableFor();
}