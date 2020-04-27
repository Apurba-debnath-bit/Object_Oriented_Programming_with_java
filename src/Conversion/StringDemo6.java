
package Conversion;


public class StringDemo6 {
    public static void main(String[] args) {
    int x = 100;
    String s = Integer.toString(x);//Primitive to String conversion.
    System.out.println(s);
    
    int s2 = 112;
    String d = Integer.toString(s2);
    System.out.println(s2);
    
    String s3 = "123";
    int h = Integer.parseInt(s3);
    System.out.println(h);
    
    String apu = "2003.89";
    double db = Double.parseDouble(apu);
    System.out.println(db);
    
    String i = "123";
    float f = Float.parseFloat(i);
    System.out.println(i);
    
    String j = "123";
    float hu = Float.valueOf(i);
    System.out.println(i);
    
    }
    
    
     
}
