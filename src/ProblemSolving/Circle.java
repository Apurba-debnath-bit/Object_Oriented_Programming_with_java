
package ProblemSolving;


public class Circle extends Shape{
    double radius;
    Circle(double redi){
        this.radius = redi;
    }
    
    @Override
    double area(){
        System.out.print("The area of Circle: \n");
        return 3.1416 * Math.pow(radius, 2);
    }
}
