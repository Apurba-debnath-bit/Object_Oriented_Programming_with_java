
package InstanceOf_Operator;


public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        B c = new C();
        System.out.println("Checking using instanceOf Operator:");
        System.out.println(a instanceof A);// True
        System.out.println(b instanceof B);//true
        System.out.println(c instanceof C);//true
        System.out.println(b instanceof A);//true(A super)
        System.out.println(c instanceof B);//true(B super)
        System.out.println(c instanceof A);//true(B super)
    }
}
