/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inferenceandabstractanimals;

/**
 *
 * @author lsnyder
 */
public class Eagle extends Birds implements IFly, IWalk, IMakeSound
{
    public Eagle(int wingspan, String name) 
    {
        super(wingspan, name);
    }

    @Override
    public void fly() 
    {
        System.out.println(name + " flys up into the sky.");
    }

    @Override
    public void walk() 
    {
        System.out.println(name + " walks to its nest with it's children.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " yells at a blue bird.");
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Wingspan: " + wingspan;
    }
}
