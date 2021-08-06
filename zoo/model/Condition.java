package zoo.model.condition;


import zoo.model.speciesAnimals.Species;

import java.util.ArrayList;
import java.util.List;

public class Condition implements InterCondition {

    List<Species> list = new ArrayList<>();

    public Condition(List<Species> list) {
        this.list = list;
    }

    @Override
    public List<Species> isAvailableFor() {
        return list;
    }

}