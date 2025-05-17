package JavaAdv.Exercises.Collections.Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private int price;
    private int yearOfRelease;
    private List<Author> authors;
    private Genre genre;

    public Book() {
        this.authors = new ArrayList<>();
    }

    public Book(String title, int price, int yearOfRelease, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.authors = authors;
        this.genre = genre;
    }

    public Book(String title, int price, int yearOfRelease, Author author, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        List<Author> authors = new ArrayList<>();
        authors.add(author);
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && yearOfRelease == book.yearOfRelease && Objects.equals(title, book.title) && Objects.equals(authors, book.authors) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfRelease, authors, genre);
    }

    @Override
    public String toString() {
        return title + '\t' + price + '\t' + yearOfRelease + '\t' + authors.size() + '\t' + genre;
    }

}
