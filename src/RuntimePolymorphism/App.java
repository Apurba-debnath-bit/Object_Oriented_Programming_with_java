
package RuntimePolymorphism;

public class App {
    public static void main(String[] args) {
        
       
//        Shape s1 = new Shape();
//        System.out.println(s1.area());/*
//        Only overridden methods will get in runtime polymorphism for applied purpose (or in daynamic method dispatch.)
//        
//        */ 
//        Shape s2 = new Triangle(23, 34);
//        System.out.println(s2.area());
//        Rectangle s3 = new Rectangle(23, 34);
//        System.out.println(s3.area());
       
//Another way to use array.

Shape [] sh = new Shape[5];
sh[0] = new Rectangle(23.0, 25.0);
sh[1] = new Rectangle(33.0, 35.0);
sh[2] = new Triangle(23.0, 25.0);
sh[3] = new Triangle(33.0, 35.0);
sh[4] = new Shape();

        for (int i = 0; i < 5; i++) {
            System.out.println(sh[i].area());
        }
        
        
    }
}
