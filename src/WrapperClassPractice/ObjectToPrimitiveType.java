package WrapperClassPractice;
//Wraper class is a mechanism to convert :
// Primitive dataType to Object;// AutoBoxing
// Object to primitive type//Unboxing-> moranota khule fela autometically.

public class ObjectToPrimitiveType {
    public static void main(String[] args) {
        Integer i = new Integer(34);
        int x = i.intValue();// Integer to int (primitive type) explicitly
        int y = i;//compiler will write i.intValue();/ //Autometic unboxing by compiler
        System.out.println(x + " " + i + " " + y);
    }
}
