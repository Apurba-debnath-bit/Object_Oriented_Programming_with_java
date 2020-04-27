
package Super2ConstructorCall;


public class B extends A{
    B(){
       // We just wanna call A() constructor here but how:;
        super();// It sould be always 1st Statement.
        /*
        that means, I am calling super class constructor 
        without parameter list(Default constructor)
        */ 
        System.out.println("B's constructor");
    }
}
