package JavaAdv.Exercises.OOP.Task3;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 1;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);

    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius + " which is a subclass off " + super.toString();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
