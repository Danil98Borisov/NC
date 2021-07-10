package shapesNC;

public class Ellipse implements Shape{
    private double a, b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public String getName(){
        return "Ellipse";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        if(a>0 && b>0){
            return Math.PI * a * b;

        }else {
            System.out.println("a<=0 or b<=0. Let's take the modulus of numbers.");
            return Math.PI * Math.abs(a * b);
        }
    }
}
