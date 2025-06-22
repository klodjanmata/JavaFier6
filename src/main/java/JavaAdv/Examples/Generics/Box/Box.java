package JavaAdv.Examples.Generics.Box;

import JavaAdv.Exercises.Collections.Task2.Author;
import JavaAdv.Exercises.Collections.Task2.Book;
import JavaAdv.Exercises.Collections.Task2.Genre;

import java.util.ArrayList;

public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(25);
        System.out.println("IntegerBox contains: " + intBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("JavaFier6");
        System.out.println("StringBox contains: " + stringBox.getItem());

        Box<Book> bookBox = new Box<>();
        bookBox.setItem(new Book(
                "Sherlock Holmes",
                1500,
                1887,
                new Author("Arthur Conan Doyle"),
                Genre.DRAMA
        ));
        System.out.println("BookBox contains: "  + bookBox.getItem());
    }
}
