
package SuperKey3;


public class Person {
    String name;
    int age;
    String phone;
    String body_color;
    double height;
    double weight;
    String bo_group;
    
    Person(String name, int age, String phone, String body_color, String bo_group, double height,double weight ){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.body_color = body_color;
        this.height = height;
        this.weight = weight;
        this.bo_group = bo_group;
    }
    
    
    void talk(){
        System.out.println("I can talk!!!");
    }
    void walk(){
        System.out.println("I can walk!!!");
    }
    
    void displayInfo(){
        System.out.println("Name is: " +name);
        System.out.println("Age is: " +age);
        System.out.println("Phone is: " +phone);
        System.out.println("Body color is: " +body_color);
        System.out.println("Height is: " + height);
        System.out.println("Weight is: " + weight);
        System.out.println("Blood group is: " + bo_group);
        
    }
}
