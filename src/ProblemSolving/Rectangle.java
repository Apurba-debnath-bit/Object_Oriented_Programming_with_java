
package ProblemSolving;


public class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double len, double wid){
        this.length = len;
        this.width = wid;
    }
    @Override
    double area(){
        System.out.print("The area of Rectangle: \n");
        return length*width;
    }
}
