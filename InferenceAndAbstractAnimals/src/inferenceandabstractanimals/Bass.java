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
public class Bass extends Fishes implements ISwim, IMakeSound
{

    public Bass(boolean isFreshWater, String name) 
    {
        super(isFreshWater, name);
    }

    @Override
    public void swim() 
    {
        System.out.println(name + " swims.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " splashes.");
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Fresh Water: " + isFreshWater;
    }
}
