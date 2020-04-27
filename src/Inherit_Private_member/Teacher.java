
package Inherit_Private_member;


public class Teacher extends Person{
    private String qualifiactaion;

    public String getQualifiactaion() {
        return qualifiactaion;
    }

    public void setQualifiactaion(String qualifiactaion) {
        this.qualifiactaion = qualifiactaion;
    }
    void displayInfo2(){
        displayInfo();
        System.out.println("Qualification is:"+ getQualifiactaion());
    }
}
