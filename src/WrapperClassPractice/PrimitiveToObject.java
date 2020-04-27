
package WrapperClassPractice;
//Wrapper class provide the mechanism to convert :
//Primitive dataType to Object and Object to primitive dataType;


public class PrimitiveToObject {
    public static void main(String[] args) {
        int i = 10;
        Integer x = Integer.valueOf(i);// boxing int to Integer 
        Integer j = i;/*
            Compiler autometically do that Integer.valueOf(i);
            autoboxing;
            wrap(morano) the primitive datatype to object using class is a mechanism
        */
        
        System.out.println(i + " " + j);
    }
}
