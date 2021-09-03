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
public class Ostrich extends Birds implements IWalk, IMakeSound
{
    public Ostrich(int wingspan, String name) 
    {
        super(wingspan, name);
    }

    @Override
    public void walk() 
    {
        System.out.println(name + " walks a few steps; then, gets distracted by a bee.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " speaks to the penguin.");
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Wingspan: " + wingspan;
    }
}
