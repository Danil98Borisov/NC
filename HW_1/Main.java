package shapesNC;

public class Main {
    static Circle circle;
    static Ellipse ellipse;
    static Square square;
    static Triangle triangle;

    public static void main (String[] args){
        circle = new Circle(-5.5);
        ellipse = new Ellipse(1.3, 4.6);
        square = new Square(6.0);
        triangle = new Triangle(5.4,8.6);

        System.out.format("Area Circle = %s \n \n", circle.getArea());
        System.out.format("Area Ellipse = %s \n \n", ellipse.getArea());
        System.out.format("Area Square = %s \n \n", square.getArea());
        System.out.format("Area Triangle = %s \n \n", triangle.getArea());

    }
}
