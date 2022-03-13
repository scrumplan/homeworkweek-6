package homeworkweek6;

/* Write a program to enter any radius value of the circle
 *and find out the area.(Formula of Area A=PI*r*r).
 */


import java.util.Scanner;

public class Program6_RadiusCircle {

    public static void main(String[] args) {

        double radius, area;
        double PI = 3.14;
        Scanner input = new Scanner(System.in);//add java.util.scanner

        System.out.println("Enter the radius of the Circle: "); // Enter the radius of the Circle : 20
        radius = input.nextDouble();
        input.close();

        area = PI * radius * radius;// formula of Area

        System.out.println("Area of the Circle is " + area); // Area of the Circle is 1256.0

    }

    {
    }
}
