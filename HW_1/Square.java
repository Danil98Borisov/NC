package shapesNC;

public class Square implements Shape{
    private double c;

    public Square(double c) {
        this.c = c;
    }

    public String getName(){
        return "Square";
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        if(c>0){
            return Math.pow(c,2);
        } else {
            System.out.println("c<=0. Let's take the modulus of numbers.");
            return Math.pow(c, 2);
        }
    }
}
