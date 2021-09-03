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
public class Penguin extends Birds implements ISwim, IWalk, IMakeSound
{
    public Penguin(int wingspan, String name) 
    {
        super(wingspan, name);
    }

    @Override
    public void swim() 
    {
        System.out.println(name + " swims through the icy cold water.");
    }

    @Override
    public void walk() 
    {
        System.out.println(name + " waddles along the ice.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " yells at the Ostrich.");
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Wingspan: " + wingspan;
    }
}
