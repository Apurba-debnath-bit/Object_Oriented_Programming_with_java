
package LinkedList_used_Object;

import java.util.LinkedList;


public class App {
    public static void main(String[] args) {
        LinkedList<Student> s= new LinkedList<>();
        
        Student s1 = new Student("101", "Apu", 23);
        Student s2 = new Student("102", "Puja", 23);
        Student s3 = new Student("102", "Apurba", 23);
        Student s4 = new Student("103", "Shuvra", 23);
        
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        
        for (Student st: s) {
            System.out.println("Name: "+st.Student_Name+" "+"ID: "+st.student_ID+"  "+ "Age: "+st.Student_Age+" \n");
        }
        
    }
}
