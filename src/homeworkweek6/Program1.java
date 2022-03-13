package homeworkweek6;

/*1.1 Declare two instance variables.
        1.2 Declare one instance method.
        1.3 Call both instance variables into the instance method inside the print statement.
        1.4 Declare the Main method.
        1.5 Call the above instance method into the Main method and Run the programme

 */

public class Program1 {
    int a = 10; // instance variable
    int b = 20; // instance variable


    public void Test1() { // Instance method

        System.out.println(a); // 10
        System.out.println(b); // 20

    }


    public static void main(String[] args) { // main method
        Program1 t = new Program1();
        t.Test1();


    }
}

