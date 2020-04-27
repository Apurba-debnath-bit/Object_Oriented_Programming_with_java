
package Hashmap;
import java.util.HashMap;

public class HashmapDemo {
    
    public static final strictfp synchronized void main(String ... args) {
        HashMap <Integer,String> Customer = new HashMap <Integer,String>();
        
        Customer.put(101, "Apurba");
        Customer.put(101, "Apua");// 101 replace by same indexNo.
        Customer.put(103, "Apurba");
        Customer.put(104, "Apurba");
        
        System.out.println(Customer.get(101));
        System.out.println(Customer.get(102));// 102 e kono value nai tai null print korche;
        System.out.println(Customer.get(103));
        System.out.println(Customer.get(104));
        
    }
}
