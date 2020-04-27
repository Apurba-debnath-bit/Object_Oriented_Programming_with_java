
package Eception_Handling;


public class Person {
    //Eception is a runtime error.
    //Abnormal condition of code sequences which throws at run time by the complier.
    
    public static void main(String[] args) {
        try{
            int[] a = new int[4];
            a[4]=10;
            System.out.println("Result:"+ a[4]);
        }catch(ArithmeticException ex1){
            System.out.println("Exception:"+ex1);
        }catch(ArrayIndexOutOfBoundsException ex2){
            System.out.println("Exception:"+ex2);
        
        }catch(Exception ex3){
            //Here Exception is the super most class.
            System.out.println("Exception:"+ex3);
        }
        finally{
            System.out.println("This is last line");
        }
        
    }
    
}
