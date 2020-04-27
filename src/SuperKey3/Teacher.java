
package SuperKey3;


public class Teacher  extends Person{
    String te_ID;
    String uni_name;
    String qualification;
    Teacher(String name, int age, String phone, String body_color, String bo_group, double height,double weight,String te_ID, String uni_name, String qualification ){
        super(name, age, phone, body_color, bo_group , height, weight);
        
        this.te_ID = te_ID;
        this.uni_name = uni_name;
        this.qualification = qualification;
    }

    
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Teacher's ID is: " + te_ID );
        System.out.println("Teacher's university name is: " + uni_name );
        System.out.println("Teacher's qualification is: " + qualification );
        System.out.println();
    }
    void talk(){
        super.talk();
        System.out.println("I am teacher,,I can talk, I am talking");
        System.out.println();
    }
    void walk(){
        super.walk();
        System.out.println("I am teacher,,I can walk, I am walking");
        System.out.println();
    }
}
