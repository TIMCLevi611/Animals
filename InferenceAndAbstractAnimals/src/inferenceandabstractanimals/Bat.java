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
public class Bat extends Mammals implements IFly, IWalk, IMakeSound
{
    public Bat(float bodyTemp, String name) 
    {
        super(bodyTemp, name);
    }

    @Override
    public void fly() 
    {
        System.out.println(name + " flys into the night.");
    }

    @Override
    public void walk() 
    {
        System.out.println(name + " walks across the the ground.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " skweeks.");
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Body Temp: " + bodyTemp;
    }
}
