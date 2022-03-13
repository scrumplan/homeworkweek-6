package homeworkweek6;
/* Program to calculate area of Triangle in java
 * with user interaction. Program will prompt user to enter the
 * base, width and hight of the triangle.
 */

import java.util.Scanner;

public class Program8_TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // scanner  syntax

        System.out.println("Enter the width of the Triangle:"); //10

        double base = scanner.nextDouble();

        System.out.println("Enter the height of the Triangle:"); //32
        double height = scanner.nextDouble();

        double area = (base * height) / 2;
        System.out.println("Area of Triangle is: " + area); // 160.0

    }

}
