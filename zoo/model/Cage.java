package zoo.model.cage;

import zoo.model.condition.InterCondition;

public class Cage implements InterCage {

    private int number;
    private int area;
    private InterCondition condition;
    private boolean vacantCage;

    public Cage(int number, int area, InterCondition condition, boolean vacantCage) {
        this.number = number;
        this.area = area;
        this.condition = condition;
        this.vacantCage = vacantCage;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public boolean isVacantCage() {
        return vacantCage;
    }

    @Override
    public InterCondition getCondition() {
        return condition;
    }


    public void setVacantCage(boolean vacantCage) {
        this.vacantCage = vacantCage;
    }
}
