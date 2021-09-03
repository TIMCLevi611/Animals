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
public class Lion extends Mammals implements IWalk, IMakeSound
{

    public Lion(float bodyTemp, String name) 
    {
        super(bodyTemp, name);
    }

    @Override
    public void walk() 
    {
        System.out.println(name + " walks through the feild.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " roars into the distance.");
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Body Temp: " + bodyTemp;
    }
}
