
package Inherit_Private_member;


public class Person {
    private String name;
    private int age;
    private String telephone_No;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getage(){
        return age;
    }
    public void setTele(String no){
        this.telephone_No = no;
    
    }
    public String getTele(){
       return telephone_No;
    
    }
    
    public void displayInfo(){
        System.out.println("Name:" + getName());
        System.out.println("Age:" + getage());
        System.out.println("Telephone_No:" + getTele());
    }
   
}
