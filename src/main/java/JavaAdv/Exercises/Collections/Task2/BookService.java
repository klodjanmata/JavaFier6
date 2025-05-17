package JavaAdv.Exercises.Collections.Task2;

import Helper.Helper;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> bookList;

    public void addBook() {
        System.out.println("Enter book details");
        Book b = new Book();
        b.setTitle(Helper.getStringFromUser("Title: "));
        b.setPrice(Helper.getIntFromUser("Price: "));
        b.setYearOfRelease(Helper.getIntFromUser("Year of release: "));
        b.setGenre(Genre.valueOf(Helper.getStringFromUser("Genre: ")));
        bookList.add(b);
        System.out.println("Book added");
    }

    public void printBookList() {
        System.out.println("Book list:");
        System.out.println("Title \t Price \t Year of release \t Authors \t Genre");
        if (bookList.isEmpty()) {
            System.out.println("No books to show");
            return;
        }
        for (Book b: bookList) {
            System.out.println(b);
        }
    }

    public BookService(){
        this.bookList = new ArrayList<>();
    }

    public BookService(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
