package JavaAdv.Exercises.Collections.Task2;

import Helper.Helper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> bookList;

    private void initBookList() {
        this.bookList = new ArrayList<>();

        bookList.add(new Book("The Great Gatsby", 15, 1925,  new Author("F. Scott Fitzgerald "), Genre.NOVEL));
        bookList.add(new Book("1984", 18, 1949,  new Author("George Orwell "), Genre.SCIENCE_FICTION));
        bookList.add(new Book("To Kill a Mockingbird", 20, 1960,  new Author("Harper Lee "), Genre.DRAMA));
        bookList.add(new Book("The Hobbit", 22, 1937,  new Author("J.R.R. Tolkien "), Genre.FANTASY));
        bookList.add(new Book("Pride and Prejudice", 17, 1813,  new Author("Jane Austen "), Genre.ROMANTIC));
        bookList.add(new Book("The Catcher in the Rye", 19, 1951,  new Author("J.D. Salinger "), Genre.DRAMA));
        bookList.add(new Book("Moby Dick", 21, 1851,  new Author("Herman Melville "), Genre.HISTORY_FICTION));
        bookList.add(new Book("War and Peace", 25, 1869,  new Author("Leo Tolstoy "), Genre.HISTORY_FICTION));
        bookList.add(new Book("The Shining", 23, 1977,  new Author("Stephen King "), Genre.HORROR));
        bookList.add(new Book("Hamlet", 12, 1603,  new Author("William Shakespeare "), Genre.DRAMA));
        bookList.add(new Book("Frankenstein", 14, 1818,  new Author("Mary Shelley "), Genre.SCIENCE_FICTION));
        bookList.add(new Book("The Alchemist", 16, 1988,  new Author("Paulo Coelho "), Genre.NOVEL));
        bookList.add(new Book("Dracula", 18, 1897,  new Author("Bram Stoker "), Genre.HORROR));
        bookList.add(new Book("Meditations", 13, 180,  new Author("Marcus Aurelius "), Genre.PSYCHOLOGY));
        bookList.add(new Book("The Art of War", 11, 500,  new Author("Sun Tzu "), Genre.HISTORY));
        bookList.add(new Book("The Road", 19, 2006,  new Author("Cormac McCarthy "), Genre.THRILLER));
        bookList.add(new Book("The Little Prince", 15, 1943,  new Author("Antoine de Saint-Exupéry "), Genre.FANTASY));
        bookList.add(new Book("Crime and Punishment", 22, 1866,  new Author("Fyodor Dostoevsky "), Genre.PSYCHOLOGY));
        bookList.add(new Book("Don Quixote", 20, 1605,  new Author("Miguel de Cervantes "), Genre.COMEDY));
        bookList.add(new Book("The Odyssey", 17, -800,  new Author("Homer "), Genre.HISTORY_FICTION));
        bookList.add(new Book("Harry Potter", 25, 1997,  new Author("J.K. Rowling "), Genre.FANTASY));
        bookList.add(new Book("A Brief History of Time", 24, 1988,  new Author("Stephen Hawking "), Genre.SCIENTIFIC));
        bookList.add(new Book("Sapiens", 23, 2011,  new Author("Yuval Noah Harari "), Genre.HISTORY));
        bookList.add(new Book("Norwegian Wood", 18, 1987,  new Author("Haruki Murakami "), Genre.NOVEL));
        bookList.add(new Book("Life of Pi", 16, 2001,  new Author("Yann Martel "), Genre.MYSTERY));
        bookList.add(new Book("The Secret Garden", 14, 1911,  new Author("Frances Hodgson Burnett "), Genre.DRAMA));
        bookList.add(new Book("Jane Eyre", 17, 1847,  new Author("Charlotte Brontë "), Genre.ROMAN));
        bookList.add(new Book("Gulliver's Travels", 13, 1726,  new Author("Jonathan Swift "), Genre.ADVENTURE));
        bookList.add(new Book("The Old Man and the Sea", 15, 1952,  new Author("Ernest Hemingway "), Genre.DRAMA));
        bookList.add(new Book("The Diary of a Young Girl", 12, 1947,  new Author("Anne Frank "), Genre.BIOGRAPHY));
    }

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

    public void removeBook(){
        System.out.println("-------------Removing book-------------");
        String title = Helper.getStringFromUser("Title: ");
        Book bookToDelete = null;
        for (Book book : bookList){
            if (book.getTitle().equalsIgnoreCase(title)){
                bookToDelete = book;
                break;
            }
        }
        if (bookToDelete != null){
            bookList.remove(bookToDelete);
            System.out.println("Book removed");
        }else {
            System.out.println("Book not found");
        }
    }

    public void printBeforeYear(){
        System.out.println("-----Printing books before Year-----");
        int year = Helper.getIntFromUser("Year: ");
        List<Book> booksToReturn = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getYearOfRelease() < year)
                booksToReturn.add(book);
        }
        printSpecificBookList(booksToReturn);
    }

    public void mostExpensive(){
        Book b = null;
        for (Book book : bookList){
            if (b == null || b.getPrice() < book.getPrice() ){
                b = book;
            }
        }
        System.out.println("Most expensive book is: "+b);
    }

    public void cheapestBook(){
        Book b = null;
        for (Book book : bookList){
            if (b == null || b.getPrice() > book.getPrice() ){
                b = book;
            }
        }
        System.out.println("Most expensive book is: "+b);
    }

    public boolean findBookByTitle(){
        System.out.println("-----------Finding Book by Title-----------:");
        String input = Helper.getStringFromUser("Title: ");
        for (Book b : bookList){
            if (b.getTitle().equalsIgnoreCase(input)){
                System.out.println("We have it!");
                return true;
            }
        }
        System.out.println("We don't have it!");
        return  false;
    }

    public void findBookByGenre(){
        System.out.println("-----Finding Books by Genre-----");
        String input = Helper.getStringFromUser("Genre: ");
        Genre genre;
        try {
            genre = Genre.valueOf(input.toUpperCase());
        }catch (Exception e){
            System.out.println("Invalid genre");
            return;
        }
        List<Book> booksToReturn = new ArrayList<>();
        for (Book b: bookList) {
            if(b.getGenre().equals(genre)){
                booksToReturn.add(b);
            }
        }
        printSpecificBookList(booksToReturn);

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

    public void findBooksByPriceRange(){
        System.out.println("---- Find By Price Range ----");
        int minPrice = Helper.getIntFromUser("Minimum Price: ");
        int maxPrice = Helper.getIntFromUser("Maximum Price: ");
        List<Book> matchingBooks = new ArrayList<>();
        matchingBooks = bookList.stream()
            .filter(book -> book.getPrice() >= minPrice && book.getPrice() <= maxPrice)
            .sorted(Comparator.comparing(Book::getPrice))
            .collect(Collectors.toList());

        if (matchingBooks.isEmpty()){
            System.out.println("No books found");
            return;
        }
        printSpecificBookList(matchingBooks);
    }

    public void printSpecificBookList(List<Book> specificList){
        System.out.println("Specific book list:");
        System.out.println("Title \t Price \t Year of release \t Authors \t Genre");
        if (specificList.isEmpty()) {
            System.out.println("No books to show");
            return;
        }
        for (Book b: specificList) {
            System.out.println(b);
        }
    }

    public BookService(){
        initBookList();
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
