
package Exception_Problem_Demo;

import java.util.Scanner;


public class ExceptionProblem {
    public static void main(String[] args) {
       int count = 1;
       do{ 
             try{
                 Scanner input = new Scanner(System.in);
                 System.out.println("Enter the first value: ");
                 int a = input.nextInt();
                 System.out.println("Enter the second value: ");
                 int b = input.nextInt();
                 double result = a/b;
                 System.out.println("The result is: "+ result);
                 count++;
             }catch(Exception ex){
                 System.out.println("Exception: "+ex);
                 System.out.println("OPS!! Please enter integer except 0: ");


             }
       }while(count==1);
    }
}
