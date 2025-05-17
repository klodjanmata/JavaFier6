package JavaAdv.Exercises.OOP.Task6;

public class Main {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(5,5,1, 4);
        MovableCircle circle = new MovableCircle(new MovablePoint(5, 5, 1, 4), 5);

        System.out.println(mp);
        mp.moveUp();
        mp.moveRight();
        System.out.println(mp);

        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);
    }
}
