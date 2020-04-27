
package Hashset;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
            s.add("Sagor");
            s.add("MOna");
            s.add("Kaua");
            s.add("Supporna");
        System.out.println(s);
        s.clear();
        System.out.println(s.isEmpty());
    }
}
