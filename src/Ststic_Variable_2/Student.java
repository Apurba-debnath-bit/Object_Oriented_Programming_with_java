
package Ststic_Variable_2;


public class Student {
    //int count = 0;
    static int count =0;
    Student(){
        count++;
    }
    
    void TotalStudent(){
        System.out.println("Total Student: "+count);
    }
}
