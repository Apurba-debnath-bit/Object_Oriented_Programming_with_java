/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClassDemo;

/**
 *
 * @author user
 */
public class Karim extends MobileUser{
// call
    @Override
    void call(){
        System.out.println("Karim is calling....");
    }
    @Override
    void sendMessage() {
        System.out.println("Hi! I am Karim!");
    }
    
}
