
package Ststic_Variable_2;

public class Test {
    public static void main(String[] args) {
        /*
        when count isn't static variable:
        int count =0;
        Here,
        Protiti alada alada object er jonno 
        constructor call hoche ar
        count er man 0 theke 1 hoye jache
        */
//        Student s1 = new Student();
//        s1.TotalStudent();// s1 alada object memory te alada jaiga niche
//        Student s2 = new Student();
//        s2.TotalStudent();// S2 alada object memory te alada jaiga niche
//        Student s3 = new Student();
//        s3.TotalStudent();// S3 alada object memory te alada jaiga niche
//        Student s4 = new Student();
//        s4.TotalStudent();// s4 alada object memory te alada jaiga niche
        
        
        /*
        When count static ba class variable and count = 0 initiallly.
        static int count = 0;
        tokhon,
        Class area te proti bar object create korai 
        alada alda jaiga niche na ai variable tar jonno;
        */
        
        Student s1 = new Student();
        s1.TotalStudent();
        Student s2 = new Student();
        s2.TotalStudent();
        Student s3 = new Student();
        s3.TotalStudent();
        Student s4 = new Student();
        s4.TotalStudent();
    }
    
    
}
