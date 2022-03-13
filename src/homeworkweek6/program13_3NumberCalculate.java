package homeworkweek6;

/* Write a Java program that takes three numbers as input
 to calculate and print the average of the numbers.
 */


import java.util.Scanner;

public class program13_3NumberCalculate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: "); // 8
        int num1 = in.nextInt();

        System.out.print("Input second number: "); // 18
        int num2 = in.nextInt();

        System.out.print("Input third number: "); // 28
        int num3 = in.nextInt();
        System.out.println("Average of three numbers is: " +
                (num1 + num2 + num3) / 3);
    }
}

