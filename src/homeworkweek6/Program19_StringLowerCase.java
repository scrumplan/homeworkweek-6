package homeworkweek6;

import java.util.Scanner;

public class Program19_StringLowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");//Input a String = THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        //Output coming =the quick brown fox jumps over the lazy dog.
    }
}
