package zoo.model.cage;

import zoo.model.condition.InterCondition;

public interface InterCage {
    //primary key
    int getNumber();
    double getArea();
    InterCondition getCondition();
    boolean isVacantCage();
}