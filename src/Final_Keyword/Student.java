
package Final_Keyword;


public class Student {
    String name;
    static int age;
    final String University_name;//Blank final variable
    // Blank final variable must be initialized in default constructor;
    Student(){
       University_name = "DIU"; //Initialized;// Assigned here
    }
    static{
        age = 25;// Static blank variable in static block
    }
    final void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University name: " + University_name);
        
    }
}
