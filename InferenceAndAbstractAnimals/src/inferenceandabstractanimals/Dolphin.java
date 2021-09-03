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
public class Dolphin extends Mammals implements ISwim, IMakeSound
{

    public Dolphin(float bodyTemp, String name) 
    {
        super(bodyTemp, name);
    }

    @Override
    public void swim()
    {
        System.out.println(name + " swims across the ocean with its fish friends.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " makes an eeee sound.");
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Body Temp: " + bodyTemp;
    }
}
