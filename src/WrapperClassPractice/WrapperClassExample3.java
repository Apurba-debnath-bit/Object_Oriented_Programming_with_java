
package WrapperClassPractice;


public class WrapperClassExample3 {
    
    public static void main(String[] args) {
        byte b = 12;
        short s = 20;
        int i = 34;
        long l = 2345;
        float f = 23.45f;
        double d = 23.5666665;
        boolean bo = true;
        char ch = 'c';
        
        //Converting primitive dataType to Object
        System.out.println("Converting primitive dataType to Object---->");
        // Class er nam boro hater okhore suru hbe always.
        //Class name always starts with Capital letter as like as any wrapper class also.
        // dataType name (primitive type data): always small letter hbe
        
        Byte byteObj = b;// autoboxing // compile will do this-> Byte.valueOf(b);
        Short shortObj = s;// autoboxing // compile will do this-> Short.valueOf(b);
        Integer integerObj = i;// autoboxing // compile will do this-> Integer.valueOf(s);
        Long longObj = l;// autoboxing // compile will do this-> Integer.valueOf(l);
        Float floatObj = f;//autoboxing primitive data;
        Double doubleObj = d;//autoboxing primitive data;
        Boolean booleanobj = bo;//autoboxing primitive data;
        Character charObj = ch;//autoboxing primitive data;
        
        //====Printing Objects:
        System.out.println(" Printing Object: ------>> ");
        System.out.println();
        
        System.out.println("Byte object: " + byteObj );
        System.out.println("Short object: " + shortObj );
        System.out.println("Integer object: " + integerObj );
        System.out.println("Long object: " + longObj );
        System.out.println("Float object: " + floatObj );
        System.out.println("Double object: " + doubleObj );
        System.out.println("Boolean object: " + booleanobj );
        System.out.println("Character object: " + charObj );
        
        // Converting Object to primitive dataType:
        //by unboxing mechanism:
        byte by = byteObj;// unboxing
        short sho = shortObj;// unboxing
        int inte = integerObj;// unboxing
        long lo = longObj;// unboxing
        float fo = floatObj;// unboxing
        double dou = doubleObj;// unboxing
        boolean boow= booleanobj;// unboxing
        char chw= charObj;// unboxing
        
        //====Printing primitive dataTypes:
        System.out.println(" primitive dataTypes: ------>> ");
        System.out.println();
        
        System.out.println("byte value: " + by);
        System.out.println("short value: " + sho);
        System.out.println("int value: " + inte);
        System.out.println("long value: " + lo);
        System.out.println("float value: " + fo);
        System.out.println("Boolean value: " + boow);
        System.out.println("Char value: " + chw);
        
    }
}
