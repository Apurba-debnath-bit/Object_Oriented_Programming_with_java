
package Satic_Method;


public class Test {
    public static void main(String[] args) {
        //non-static method ta use korte chai tai object create korte hbe:
        Student s1;// Student class er object declaration;
        s1 = new Student();// s1 object ti creation ba instantiation. 
        s1.display1();//non-static method use kore object create korlam
        //Ekhn static method use korte chachi: so, 
        //direct class er nam use kore static property use korbo
        Student.display2();
    }
}
