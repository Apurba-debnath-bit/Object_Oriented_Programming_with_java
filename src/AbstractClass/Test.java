
package AbstractClass;


public class Test {
    public static void main(String[] args) {
            //wrong: Mobile mb1 = new Mobile();
            /*
            Mobile mb1 = new Mobile();-->This is wrong, Because:
            Abstract class cann't be instantiated
            So, we cann't write 
            new Mobile();
            */ 
            Mobile mb1;
            mb1 = new Karim();
            mb1.call();
            mb1.sendMessage();
            mb1 = new Rahim();
            mb1.call();
            mb1.sendMessage();
    }
}
