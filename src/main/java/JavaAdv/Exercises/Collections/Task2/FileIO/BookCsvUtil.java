package JavaAdv.Exercises.Collections.Task2.FileIO;

import JavaAdv.Exercises.Collections.Task2.Author;
import JavaAdv.Exercises.Collections.Task2.Book;
import JavaAdv.Exercises.Collections.Task2.BookService;
import JavaAdv.Exercises.Collections.Task2.Genre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class BookCsvUtil {
    private final String FILEPATH = "Files/Library/Books.csv";
    private final String SEPARATOR = ",";

    private String headLine(){
        return
            "Title" + SEPARATOR
            + "Price" + SEPARATOR
            + "Year" + SEPARATOR
            + "Genre" + SEPARATOR
            + "Author" + SEPARATOR;
    }

    public static void main(String[] args) {
        List<Book> bookList = new BookCsvUtil().readFromFile();
        for (Book book : bookList) {
            System.out.println(book.getTitle());
        }
    }

    public List<Book> readFromFile() {
        System.out.println("Reading from file...");
        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH))) {
            List<Book> bookList = new ArrayList<>();
            String line;
            boolean firstLine = true;
            while((line = br.readLine()) != null){
                if (firstLine){
                    firstLine = false;
                    continue;
                }
                String[] fields = line.split(SEPARATOR);
                Book b = new  Book();
                b.setTitle(fields[0]);
                b.setPrice(Integer.parseInt(fields[1]));
                b.setYearOfRelease(Integer.parseInt(fields[2]));
                b.setGenre(Genre.valueOf(fields[3]));
                List<Author> authorList = new ArrayList<>();
                authorList.add(new  Author(fields[4]));
                b.setAuthors(authorList);
                bookList.add(b);
            }
            System.out.println("File read successfully!");
            return bookList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeToFile(List<Book> bookList){
        System.out.println("Writing to file...");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH))){
            bw.write(headLine());
            for (Book book : bookList){
                bw.newLine();
                bw.write(book.getTitle() + SEPARATOR);
                bw.write(String.valueOf(book.getPrice()) + SEPARATOR);
                bw.write(String.valueOf(book.getYearOfRelease()) + SEPARATOR);
                bw.write(book.getGenre().name() + SEPARATOR);
                bw.write(book.getAuthors().get(0).getName() + SEPARATOR);
            }
            bw.close();
            System.out.println("File written successfully!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
