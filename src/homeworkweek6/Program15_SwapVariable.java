package homeworkweek6;

/* Write a Java program to swap two variables.*/

public class Program15_SwapVariable {
    public static void main(String[] args) {

        int a, b, swap;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = " + a + ", " + +b); //Before swapping : a, b = 15, 27
        swap = a;
        a = b;
        b = swap;
        System.out.println("After swapping : a, b = " + a + ", " + +b); // After swapping : a, b = 27, 15
    }
}
