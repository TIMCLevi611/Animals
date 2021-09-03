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
public class Shark extends Fishes implements ISwim, IMakeSound
{

    public Shark(boolean isFreshWater, String name) 
    {
        super(isFreshWater, name);
    }

    @Override
    public void swim() 
    {
        System.out.println(name + " swims to fish and eats it.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " splashes the water.");
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Fresh Water: " + isFreshWater;
    }
}
