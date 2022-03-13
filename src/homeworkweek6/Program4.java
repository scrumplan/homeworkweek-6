package homeworkweek6;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program4 {


    int a = 30; // instance variable
    int b = 40; // instance variable
    static String name = "Sonali";  // static variable
    static String Surname = "Patel"; // static variable


    public void Test1() { // Instance method
        System.out.println(a); // 30
        System.out.println(b); // 40
        System.out.println(Program4.name); // Sonali
        System.out.println(Program4.Surname); // Patel
    }

    public static void test2() { // Static method
        Program4 t = new Program4(); // t is object
        System.out.println(t.a); // 30
        System.out.println(t.b); // 40
        System.out.println(name);//Sonali
        System.out.println(Surname);// Patel


    }

    public static void main(String[] args) { // main method
        Program4 t = new Program4();
        t.Test1();
        test2();


    }


}


















