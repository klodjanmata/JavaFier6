package JavaAdv.Exercises.OOP.Task5;

import JavaAdv.Exercises.OOP.Task1.Point2D;

public class Line {
    private Point2D start;
    private Point2D end;

    public Line(Point2D start, Point2D end){
        this.start = start;
        this.end = end;
    }

    public Line(float x1, float y1, float x2, float y2){
        this.start = new Point2D(x1, y1);
        this.end = new Point2D(x2, y2);
    }

    public double getLength(){
        return Math.sqrt(
                Math.pow(end.getX() - start.getX(), 2) +
                Math.pow(end.getY() - start.getY(), 2)
        );
    }

    public Point2D getMidPoint(){
        float x = (start.getX() + end.getX()) / 2;
        float y = (start.getY() + end.getY()) / 2;
        return new Point2D(x, y);
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }
}
