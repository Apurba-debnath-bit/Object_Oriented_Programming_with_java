
package SuperKey3;


public class Application_Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr.Apurba", 23, "01745431563", "Light_gray", "O+", 5.6, 65.67, "te-0012", "DIU", "Lecturar");
        t1.displayInfo();
        t1.talk();
        t1.walk();
        
        Student s1 = new Student("Apu debnath", 13, "+2017563", "gray", "O+", 5.6, 50.67,"001-2345","3rd yr");
        s1.displayInfo();
        s1.talk();
        s1.walk();
    }
}
