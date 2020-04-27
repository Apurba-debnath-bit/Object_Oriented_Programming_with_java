
package Var_args_Method;


public class ProblemSolution {
    // int means kon typer variable length declare korte chachi..
    //... means any length
    // num means num[] (array type variable name) er modhe value index onujai asbe
    void add(int ... num){
        int sum = 0;
        for(int x : num){
            sum = sum + x;
        }
        System.out.println("The sum is: " + sum);
    }
}
