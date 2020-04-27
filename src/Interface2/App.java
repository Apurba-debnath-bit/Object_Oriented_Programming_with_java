
package Interface2;


public class App {
    public static void main(String[] args) {
        A a1 = new A();
        a1.a=23;
        a1.b = 24;
        a1.c = 25;
        a1.display();
        System.out.println("The addition is: "+ a1.add());
    }
}
