package javaBasics;
import java.io.Console;
import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = in.nextLine();
        System.out.println("You entered string " + s);
        in.close();
    }
}