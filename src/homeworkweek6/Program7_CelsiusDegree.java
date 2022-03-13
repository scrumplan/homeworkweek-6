package homeworkweek6;

/* Write a program to insert any temperature value in degree
 *Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Program7_CelsiusDegree {

    public static void main(String[] args) {

        //Create scanner Object and pass string in it
        Scanner input = new Scanner(System.in);//using scanner syntax
        System.out.println("Input a degree in Fahrenheit= "); // Input a degree in Fahrenheit= 2
        double F = input.nextDouble();

        double celsius = ((F - 32) * 5 / 9);
        System.out.println(F + " degree Fahrenheit is equal to " + celsius + "in celsius");
        //Result coming = 2.0 degree Fahrenheit is equal to -16.666666666666668in celsius
    }
}
