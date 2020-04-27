
package javaooppractice;


public class Box {
    int height;
    int width;
    int lenght;
    public void setInfo(int height, int width, int length ){
        this.height = height;
        this.width = width;
        this.lenght = length;
        
    }
    public int volume(){
        return height*width*lenght;
        
    }
    
    public void displayInfo(){
        System.out.println("The height is: " + height);
        System.out.println("The width is: " + width);
        System.out.println("The lenght is: " + lenght);
    }
}
