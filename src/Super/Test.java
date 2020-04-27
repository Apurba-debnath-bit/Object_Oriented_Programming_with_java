
package Super;


public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();// why return 5(sub class er variable khetre sub class er priority besi)
        //After calling super class variable x using super.x
        s1.display2();//using super keyword 
    }
}
