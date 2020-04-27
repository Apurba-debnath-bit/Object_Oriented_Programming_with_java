
package Super_Key;

public class Vehicle {
    String color;
    int weight;
    
    Vehicle(String color, int weight ){
        this.color = color;
        this.weight = weight;
    }
    
    void attribute(){
        System.out.println("The color is: " + color);
        System.out.println("The weight is: " + weight);
    }
}
