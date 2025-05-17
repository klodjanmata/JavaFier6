package JavaAdv.Exercises.OOP.Task3;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("RED", true, 4);
        System.out.println(circle);
        System.out.println("Circle area = " + circle.getArea());
        System.out.println("Circle perimeter = " + circle.getPerimeter() + "\n");

        Rectangle rectangle = new Rectangle("Blue", true, 5, 6);
        System.out.println(rectangle);
        System.out.println("Rectangle area = " + rectangle.getArea());
        System.out.println("Rectangle perimeter = " + rectangle.getPerimeter() + "\n");

        Square square = new Square("Green", true, 5);
        System.out.println(square);
        System.out.println("Square area = " + square.getArea());
        System.out.println("Square perimeter = " + square.getPerimeter() + "\n");

    }
}
