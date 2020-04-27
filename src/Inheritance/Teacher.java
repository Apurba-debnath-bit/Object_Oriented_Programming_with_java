
package Inheritance;


public class Teacher extends Person{
    //name, age, displayInfo(), telephoneNo
    String qualification;
    void displayInfo2(){
        displayInfo();
        System.out.println("The qualification : " + qualification);
    }
}
