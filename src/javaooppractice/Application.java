
package javaooppractice;


public class Application {
    public static void main(String[] args) {
        Box bx1 = new Box();
        Box bx2 = new Box();
        bx1.setInfo(12, 30, 56);
        bx2.setInfo(22, 320, 536);
        System.out.println("The volume of bx1 is: "+bx1.volume());
        System.out.println("The volume of bx2 is: "+bx2.volume());
        
    }
}
