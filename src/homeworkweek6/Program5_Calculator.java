package homeworkweek6;
/* Write a program for a calculator with addition, subtraction,
 *multiplication and division methods all with parameters
 *and use string concatenation methods.(Note: Two static and Two instance methods.)
 */

public class Program5_Calculator {

    public static void main(String[] args) {

        Program5_Calculator p = new Program5_Calculator(); // object p creation

        addition(25, 20); //45
        subtraction(89, 40); //49
        p.multiplication(4, 50); //200
        p.division(300, 50); //6

    }

    public static void addition(int a, int b) { // static method
        System.out.println("Addition of a and b is = " + (a + b));

    }

    public static void subtraction(int a, int b) { // static method
        System.out.println("Subtraction of a and b is = " + (a - b));
    }

    public void multiplication(int a, int b) { // Instance method
        System.out.println("Multiplication of a and b is = " + (a * b));
    }

    public void division(int a, int b) { // Instance method
        System.out.println("Addition of a and b is = " + (a / b));
    }

}




