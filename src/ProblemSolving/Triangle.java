
package ProblemSolving;


public class Triangle extends Shape{
    double base;
    double height;
    Triangle( double base,  double height){
        this.base= base;
        this.height = height;
    }
    @Override
    double area(){
        System.out.print("The area of Triangle is: \n");
        return 0.5*base* height;
    }
}
