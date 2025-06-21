package JavaAdv.Exercises.Collections.Task2.FileIO;

import JavaAdv.Exercises.Collections.Task2.Book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class BookCsvUtil {
    private final String FILEPATH = "Files/Library/Books.csv";
    private final char SEPARATOR = ',';

    private String headLine(){
    return       "Title" + SEPARATOR
                + "Price" + SEPARATOR
                + "Year" + SEPARATOR
                + "Genre" + SEPARATOR
                + "Author" + SEPARATOR;
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
