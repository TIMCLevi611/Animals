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
public class FlyingFish extends Fishes implements IFly, ISwim, IMakeSound
{
    public FlyingFish(boolean isFreshWater, String name) 
    {
        super(isFreshWater, name);
    }

    @Override
    public void fly() 
    {
        System.out.println(name + " flys across the water.");
    }

    @Override
    public void swim() 
    {
        System.out.println(name + " swims across the water.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " makes noise by falling into the water.");
    }

    @Override
    public String toString() 
    {
        return "Name: " + name + ", Fresh Water: " + isFreshWater;
    }
}
