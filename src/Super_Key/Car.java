
package Super_Key;


public class Car extends Vehicle {
    int gear;
    Car(String color, int weight, int gear){
        super(color,weight);
        this.gear = gear;
    }
    
    @Override
    void attribute(){
        super.attribute();
        System.out.println("The gear is:" + gear);
    }
    
}
