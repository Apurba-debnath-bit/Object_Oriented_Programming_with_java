
package LinkedList;

import java.util.LinkedList;


public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> n = new LinkedList<>();
        System.out.println("List in initial stage: ");
        n.add("Puja");
        n.add("Apu");
        n.add("partho");
        n.add("Shuvra");
        n.add("Suchona");
        n.add("Rothosri");
        System.out.println("List after adding all value: " + n);
        
        n.remove(2);
        System.out.println("List after delete one value by index : " + n);
        n.removeFirstOccurrence("Rothosri");
        System.out.println("List after delete First Occurrence : " + n);
        n.removeLastOccurrence("Shuvra");
        System.out.println("List after delete last Occurrence : " + n);
        n.removeLastOccurrence("Puja");
        System.out.println("List after delete last Occurrence : " + n);
        n.removeFirst();
        System.out.println("after delete first value from list:"+n);
        n.add(0,"wwe");
        n.removeLast();
        System.out.println("after delete first value from list:"+n);
        //Size of Linked List
        System.out.println("Size of LinkedList is: "+n.size());
        boolean g = n.contains("lula");
        System.out.println("Checking content: "+ g);
        n.clear();
        
    }
}
