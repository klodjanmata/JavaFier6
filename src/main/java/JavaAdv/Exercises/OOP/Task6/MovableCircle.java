package JavaAdv.Exercises.OOP.Task6;

public class MovableCircle implements Movable {

    private MovablePoint center;
    private int radius;

    public MovableCircle(MovablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return String.format("Circle with center %s and radius %d", center, radius);
    }

}
