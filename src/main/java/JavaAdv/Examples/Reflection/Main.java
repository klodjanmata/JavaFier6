package JavaAdv.Examples.Reflection;

import JavaAdv.Exercises.OOP.Task3.Rectangle;

import java.lang.reflect.Method;

public class Main extends Object{
    public static void main(String[] args) {
        Class<?> rectangleClass = Rectangle.class;
        try {
            Rectangle rectangle = (Rectangle) rectangleClass.newInstance();
            Method[] rectangleMethods = rectangleClass.getDeclaredMethods();
            for (Method rectangleMethod : rectangleMethods) {
                System.out.println(rectangleMethod.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
