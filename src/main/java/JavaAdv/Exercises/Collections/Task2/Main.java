package JavaAdv.Exercises.Collections.Task2;

import Helper.Helper;

import java.util.ArrayList;

public class Main {
    private static BookService bookService = new BookService();

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit){
            Menu.printMenu();
            int choice = Helper.getIntFromUser("Enter your choice: ");
            exit = manageChoice(choice);
        }



    }

    public static boolean manageChoice(int choice){
        switch (choice) {
            case 1:
                bookService.addBook();
                break;
            case 2:
                bookService.removeBook();
                break;
            case 3:
                bookService.printBookList();
                break;
            case 4:
                bookService.findBookByGenre();
                break;
            case 5:
                bookService.printBeforeYear();
                break;
            case 6:
                bookService.mostExpensive();
                break;
            case 7:
                bookService.cheapestBook();
                break;
            case 8:
                bookService.findBookByTitle();
                break;
            case 9:
                bookService.findBooksByPriceRange();
                break;
            case 10:
                bookService.writeToFile();
                break;
            case 0:
                System.out.println("Exiting...");
                return true;
            default:
                System.out.println("Invalid choice");
                System.out.println("Chose Again!");
                break;
        }
        return false;
    }
}
