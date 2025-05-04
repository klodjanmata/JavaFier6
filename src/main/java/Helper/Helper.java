package Helper;

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

    public static char getCharFromUser(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return (char) scanner.nextByte();
    }
}
