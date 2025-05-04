package JavaAdv.Exercises.Collections.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService(new ArrayList<>());
        bookService.printBookList();

        bookService.addBook();
        bookService.addBook();

        bookService.printBookList();
    }
}
