
package Method_argument;


public class Test {
    public static void main(String[] args) {
        CallByValue obj = new CallByValue();
        int x = 30;//Primitive data
        System.out.println("Before calling:" + x);
        obj.change(x);
        System.out.println("After Calling: " + x);
        
        System.out.println("Call by Reference: printing--");
        CallByReference obj1 = new CallByReference();
        obj1.name="Anis";
        System.out.println("Before calling:" + obj1.name);
        obj1.change(obj1);
        System.out.println("Before calling:" + obj1.name);//Original value change by (pass by reference)
    }
}
