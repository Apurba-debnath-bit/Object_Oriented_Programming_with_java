
package Type_casting;


public class A {
    public static void main(String[] args) {
        double d = 10.5;
        int x = (int)d;
        System.out.println("Narrowing: Large to small dataYpe:" + x);
        
        int a = 12;
        double y = a;
        System.out.println("widining Casting: small to Large:"+a);
        
        B b1 = new D();// Upcasting super class object = sub class object;
        // java doesn't support downcasting;
        b1.displayInfo();
        //D d1 = new B();// java doesn't supprot it.
        //D d1 = (D)new B();
        //d1.displayInfo();//Runtime error dibe;
    }
}
