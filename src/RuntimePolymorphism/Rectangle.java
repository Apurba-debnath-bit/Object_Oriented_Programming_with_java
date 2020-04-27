
package RuntimePolymorphism;


public class Rectangle extends Shape {
    double length;
    double width;
    
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override// Polymorhism(Runtime)
    double area(){
        System.out.print("The area of Rectangle is: \n");
        return this.length * this.width;
        
    }
    
}
