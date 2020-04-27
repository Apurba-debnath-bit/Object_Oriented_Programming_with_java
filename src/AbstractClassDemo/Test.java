
package AbstractClassDemo;


public class Test {
    public static void main(String[] args) {
        MobileUser mb ;//MobileUser cann't be instatiated
        mb = new Rahim();
        mb.sendMessage();
        mb.call();
        mb = new Karim();
        mb.sendMessage();
        mb.call();
    }
}
