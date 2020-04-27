
package Interface2;


public class A implements B{
    int a, b, c;
    @Override
    public void display(){
        System.out.println("Displaying ");
    }
    @Override
    public void play(){
        System.out.println("Playing");
    }
    @Override
    public int add(){
        return a+b+c;
    }
    
}
