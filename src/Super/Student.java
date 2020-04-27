
package Super;


public class Student  extends Person{
    int x = 5;
    void display(){
        System.out.println(x);
    }
    void display2(){
        System.out.println(super.x);
    }
}
