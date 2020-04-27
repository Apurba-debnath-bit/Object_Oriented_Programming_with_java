
package Var_arg_Method2;


public class Student {
    
    void payMent(double ... pay){
        double sum = 0;
        for(double p : pay){
            sum = sum + p;
        }
        System.out.println("TotalPay:" + sum);
    }
}
