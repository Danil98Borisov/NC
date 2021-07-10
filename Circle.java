package shapesNC;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius > 0) {
            return Math.PI * Math.pow(radius, 2);
        }else {
            System.out.println("Radius<=0 Let's take the modulus of numbers.");
            return Math.PI * Math.pow(radius, 2);
        }
    }
}