
package ProblemSolving;


public class Application {
    public static void main(String[] args) {
        Shape[] s1; //= new Shape(); shape class cann't be instantiated
        Shape[] s2; //= new Shape(); shape class cann't be instantiated
        Shape[] s3; //= new Shape(); shape class cann't be instantiated
        s1 = new Circle[3];
        
        s2 = new Triangle[4];
//        
        s3 = new Rectangle[3];
        
        s1[0] = new Circle(23.4);
        s1[1] = new Circle(34);
        s1[2] = new Circle(29);
        
        s2[0] = new Triangle(56,34);
        s2[1] = new Triangle(12, 21);
        s2[2] = new Triangle(29,89);
        
        s3[0] = new Rectangle(56, 34);
        s3[1] = new Rectangle(12, 21);
        s3[2] = new Rectangle(29,89);
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s1[i].area());
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(s2[i].area());
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(s3[i].area());
        }
        
    }
}
