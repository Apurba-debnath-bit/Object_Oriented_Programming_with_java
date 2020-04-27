
package Anonymus_class;


public class Test {
    public static void main(String[] args) {
        Person p = new Person(){
            @Override
            void display(){
                System.out.println("From Anonymous Class");
            }
        
        };
        p.display();
    }
}
