package JavaAdv.Exercises.Task3;

public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square(String color, boolean isFilled, double width){
        super(color, isFilled, width, width);
    }

    @Override
    public String toString(){
        return "Square with width = " + super.getWidth() + " which is a subclass off " + super.toString();
    }
}
