
package OOP;


public class Test {
    
    public static void main(String[] args) {
        Teacher teacher1;// Object Declaration
        teacher1 = new Teacher();// Object creation
        teacher1.name ="Mr.Ranjit";
        teacher1.designation ="Principle";
        teacher1.pho="0174556";
        teacher1.gender="Male";
        
        System.out.println("Teacher1's name: " + teacher1.name);
        System.out.println("Teacher1's name: " + teacher1.pho);
        System.out.println("Teacher1's name: " + teacher1.gender);
        System.out.println("Teacher1's name: " + teacher1.designation);
        System.out.println();
        Teacher teacher2 ;
        teacher2 = new Teacher();
        
        teacher2.name ="Mr.Ranjit";
        teacher2.designation ="Principle";
        teacher2.pho="0174556";
        teacher2.gender="Male";
        
        System.out.println("Teacher1's name: " + teacher1.name);
        System.out.println("Teacher1's name: " + teacher1.designation);
        System.out.println("Teacher1's name: " + teacher1.gender);
        System.out.println("Teacher1's name: " + teacher1.pho);
    }
}
