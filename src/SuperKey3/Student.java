
package SuperKey3;


public class Student extends Person {
    String Std_Id;
    static String uni_Name ="DIU";
    String year_std;
    Student(String name, int age, String phone, String body_color,  String bo_group, double height,double weight, String Std_ID, String year_std){
        super(name, age, phone, body_color, bo_group, height, weight);
        this.Std_Id = Std_ID;
        this.year_std = year_std;
        
    }
    
    @Override
    void talk(){
        super.talk();
        System.out.println("I am student");
        System.out.println();
    }
    @Override
    void walk(){
        super.walk();
        System.out.println("I am student, I can walk");
        System.out.println();
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Student id is: "+Std_Id  );
        System.out.println("Student's year is: " + year_std  );
        System.out.println("Student's University name is: " + uni_Name );
        System.out.println();
    }
}
