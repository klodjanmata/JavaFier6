package Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Helper {

    public static String getStringFromUser(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int getIntFromUser(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static Date getDateFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Format: yyyy.MM.dd HH:mm");
        System.out.print(message);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        try{
            return sdf.parse(scanner.nextLine());
        }catch(ParseException e){
            System.out.println("Invalid date");
            e.printStackTrace();
            return null;
        }
    }

    public static boolean getBooleanFromUser(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 for Yes and 0 for No");
        System.out.print(message);
        int choice = scanner.nextInt();
        if (choice == 1){
            return true;
        }
        return false;
    }

    public static char getCharFromUser(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return (char) scanner.nextByte();
    }
}
