package JavaAdv.Exercises.OOP.Task3;

public abstract class Shape{
    protected String color;
    protected boolean isFilled;

    public Shape(String color, boolean isFilled){
        this.color=color;
        this.isFilled=isFilled;
    }

    public Shape(){
        color = "unknown";
        isFilled = false;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString(){
        return "Shape with color of " + color + " and " + (isFilled ? "filled" : "not filled");
//        if (isFilled) {
//            "filled"
//        }
//        else{
//            "not filled"
//        }
    }

}