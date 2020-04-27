
package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();//Size define kora lage na
        
        
        list.add("Bangladesh");
        list.add("Canada");
        list.add("USA");
        list.add("UK");
        list.add("India");
        list.add("China");
        
        list.addFirst("Ami");
        list.addLast("Tumi");
        
        for(String x: list){
            System.out.println(x);
        }
        System.out.println();
        System.out.println("Using while: \n\n");
        Iterator<String> itr = list.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        list.add(2, "Pagol");
        System.out.println("After adding new one element with indexing: ");
        System.out.println(list);
        
        itr = list.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        LinkedList<String> list2 = new LinkedList<>();
        
        list2.add("Sagor");
        list2.add("moli");
        list2.add("Nodi");
        list.addAll( 2, list2);
        System.out.println();
        System.out.println("After adding List2 to List: \n");
        itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
