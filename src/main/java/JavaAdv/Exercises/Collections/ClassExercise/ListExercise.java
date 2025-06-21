package JavaAdv.Exercises.Collections.ClassExercise;

import JavaAdv.Exercises.Collections.Task2.Author;
import JavaAdv.Exercises.Collections.Task2.Book;
import JavaAdv.Exercises.Collections.Task2.Genre;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListExercise {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        fillListOfBooks(bookList);
//        for (Book book : bookList) {
//            System.out.println(book.getTitle());
//        }

        List<Book> sortedList = bookList.stream()
                .sorted(Comparator.comparing(Book::getYearOfRelease))
                .collect(Collectors.toList());

        System.out.println("Ordered List: ");
        for (Book book : sortedList) {
            System.out.println(book.getTitle() + " --- " + book.getYearOfRelease());
        }


    }

    private static void fillListOfBooks(List<Book> bookList) {
        bookList.add(new Book("The Great Gatsby", 15, 1925, new Author("F. Scott Fitzgerald "), Genre.NOVEL));
        bookList.add(new Book("1984", 18, 1949, new Author("George Orwell "), Genre.SCIENCE_FICTION));
        bookList.add(new Book("To Kill a Mockingbird", 20, 1960, new Author("Harper Lee "), Genre.DRAMA));
        bookList.add(new Book("The Hobbit", 22, 1937, new Author("J.R.R. Tolkien "), Genre.FANTASY));
        bookList.add(new Book("Pride and Prejudice", 17, 1813, new Author("Jane Austen "), Genre.ROMANTIC));
        bookList.add(new Book("The Catcher in the Rye", 19, 1951, new Author("J.D. Salinger "), Genre.DRAMA));
        bookList.add(new Book("Moby Dick", 21, 1851, new Author("Herman Melville "), Genre.HISTORY_FICTION));
        bookList.add(new Book("War and Peace", 25, 1869, new Author("Leo Tolstoy "), Genre.HISTORY_FICTION));
        bookList.add(new Book("The Shining", 23, 1977, new Author("Stephen King "), Genre.HORROR));
        bookList.add(new Book("Hamlet", 12, 1603, new Author("William Shakespeare "), Genre.DRAMA));
        bookList.add(new Book("Frankenstein", 14, 1818, new Author("Mary Shelley "), Genre.SCIENCE_FICTION));
        bookList.add(new Book("The Alchemist", 16, 1988, new Author("Paulo Coelho "), Genre.NOVEL));
        bookList.add(new Book("Dracula", 18, 1897, new Author("Bram Stoker "), Genre.HORROR));
        bookList.add(new Book("Meditations", 13, 180, new Author("Marcus Aurelius "), Genre.PSYCHOLOGY));
        bookList.add(new Book("The Art of War", 11, 500, new Author("Sun Tzu "), Genre.HISTORY));
        bookList.add(new Book("The Road", 19, 2006, new Author("Cormac McCarthy "), Genre.THRILLER));
        bookList.add(new Book("The Little Prince", 15, 1943, new Author("Antoine de Saint-Exupéry "), Genre.FANTASY));
        bookList.add(new Book("Crime and Punishment", 22, 1866, new Author("Fyodor Dostoevsky "), Genre.PSYCHOLOGY));
        bookList.add(new Book("Don Quixote", 20, 1605, new Author("Miguel de Cervantes "), Genre.COMEDY));
        bookList.add(new Book("The Odyssey", 17, -800, new Author("Homer "), Genre.HISTORY_FICTION));
        bookList.add(new Book("Harry Potter", 25, 1997, new Author("J.K. Rowling "), Genre.FANTASY));
        bookList.add(new Book("A Brief History of Time", 24, 1988, new Author("Stephen Hawking "), Genre.SCIENTIFIC));
        bookList.add(new Book("Sapiens", 23, 2011, new Author("Yuval Noah Harari "), Genre.HISTORY));
        bookList.add(new Book("Norwegian Wood", 18, 1987, new Author("Haruki Murakami "), Genre.NOVEL));
        bookList.add(new Book("Life of Pi", 16, 2001, new Author("Yann Martel "), Genre.MYSTERY));
        bookList.add(new Book("The Secret Garden", 14, 1911, new Author("Frances Hodgson Burnett "), Genre.DRAMA));
        bookList.add(new Book("Jane Eyre", 17, 1847, new Author("Charlotte Brontë "), Genre.ROMAN));
        bookList.add(new Book("Gulliver's Travels", 13, 1726, new Author("Jonathan Swift "), Genre.ADVENTURE));
        bookList.add(new Book("The Old Man and the Sea", 15, 1952, new Author("Ernest Hemingway "), Genre.DRAMA));
        bookList.add(new Book("The Diary of a Young Girl", 12, 1947, new Author("Anne Frank "), Genre.BIOGRAPHY));
    }
}
