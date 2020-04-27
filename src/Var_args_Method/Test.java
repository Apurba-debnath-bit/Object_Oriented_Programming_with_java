
package Var_args_Method;


public class Test {
    
    public static void main(String[] args) {
        Addition obj1 = new Addition();
        obj1.add(10, 20);
        //ekhn amara chachi 3 ta value jog korte:int type er
        obj1.add(10, 20, 30);
        obj1.add(10, 20, 30,40);
        obj1.add(10, 20, 30,40, 70);
        //tai argument(actual) length barate bar bar new method oi class e declare korte hoche
        //ja kokhonoi efficient programming noy.
        //Amra ekhn oi problem er solution ta dekhbo var-arg method er madhome:
        //Var-length-argument(Var-arg) method ti ProblemSolution class e declare kora holo
        //Test class e tar object declare kora holo
        System.out.println("After declaration of var-arg method in ProblemSolution class");
        ProblemSolution pb1 = new ProblemSolution();
        pb1.add(12,13,14);
        pb1.add(13, 45, 56, 67,78);
        pb1.add(32, 44, 34, 22, 20, 88, 99, 100);
        pb1.add(32, 44, 34, 22, 20, 88, 99, 100, 22, 33, 45);
        
    }
}
