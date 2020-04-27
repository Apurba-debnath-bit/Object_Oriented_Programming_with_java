
package Final_Keyword;


public class Rahim extends Student {
     String std_ID;
     String phone_No;
    
    void displayInfo2(){
        displayInfo();// only can inherit a final method.
        System.out.println("ID:"+std_ID);
        System.out.println("Phone No:"+phone_No);
    }
}
