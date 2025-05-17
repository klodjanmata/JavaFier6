package JavaAdv.Exercises.OOP.Task3;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length){
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return "Rectangle with width = " + width +
                " and length = " + length + " which is a subclass off " +
                super.toString();
    }
}
