package shapesNC;

public class Triangle implements Shape{
    private double height, base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public String getName(){

        return "Triangle";
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double getBase() {

        return base;
    }

    public void setBase(double base) {

        this.base = base;
    }

    @Override
    public double getArea() {
        if(height>0 && base>0){
            return 0.5 * height * base;
        }else {
            System.out.println("height<=0 or base<=0. Let's take the modulus of numbers.");
            return 0.5 * Math.abs(height * base);
        }
    }
}
