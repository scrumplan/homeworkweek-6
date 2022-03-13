package homeworkweek6;

/* Write a program to convert the upper case to lower case.*/

import java.util.Scanner;

public class Program9_UpperLowerCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // using scanner syntaxt

        System.out.println("Enter a String "); // Sonali
        String userInputString = scanner.nextLine();

        //print uppercase string
        System.out.println("Uppercase string " + userInputString.toUpperCase()); // Uppercase string SONALI

        //print lowercase string
        System.out.println("Lowercase string " + userInputString.toLowerCase()); // Lowercase string sonali
    }
}



