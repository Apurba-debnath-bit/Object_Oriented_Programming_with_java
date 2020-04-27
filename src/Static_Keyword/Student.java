
package Static_Keyword;


public class Student {
    String name;
    String id;
    int age;
    static String University = "DIU";
    
    Student(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("Student name:" + name);
        System.out.println("Student id:" + id);
        System.out.println("Student age:" + age);
        System.out.println("Student University_name:" + University);
        System.out.println();
    }
}
