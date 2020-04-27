
package OOP.Encapsulation;


public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.setName("apurba");
        s1.setAge(34);
        s2.setName("Rotho");
        s2.setAge(21);
        s3.setName("Sagor");
        s3.setAge(28);
        s4.setName("Adbbb");
        s4.setAge(45);
        System.out.println("The s1 name is: " + s1.getName());
        System.out.println("The s1 age is: " + s1.getAge());
        System.out.println("The s2 name is: " + s2.getName());
        System.out.println("The s2 age is: " + s2.getAge());
        System.out.println("The s3 name is: " + s3.getName());
        System.out.println("The s1 age is: " + s3.getAge());
        System.out.println("The s4 name is: " + s4.getName());
        System.out.println("The s1 age is: " + s4.getAge());
    }
    
}
