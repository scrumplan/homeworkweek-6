package homeworkweek6;

/* Write a Java program to convert a decimal number to binary number.
 *Input Data: Input a Decimal Number : 5
 *  Expected Output Binary number is: 101
 */

import java.util.Scanner;

public class Program17_DecimalBinary {


    public static void main(String[] args) {
        dectobinary();
    }

    public static void dectobinary(){
        int x;
        String binary;
        System.out.println("Enter the number="); // input 5
        Scanner scan = new Scanner(System.in);
        x=scan.nextInt();
        binary = Integer.toBinaryString(x);
        System.out.println("Binary number is =" +binary);

        }

    }

