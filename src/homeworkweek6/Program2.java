package homeworkweek6;


/* 2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
*/

public class Program2 {
    static String name = "Sonali";  // static variable
    static String Surname = "Patel"; // static variable


    public static void Test1() { // static  method

        System.out.println(name); // Sonali
        System.out.println(Surname); // Patel
    }


    public static void main(String[] args) {  // main method
        Test1();
    }
}
