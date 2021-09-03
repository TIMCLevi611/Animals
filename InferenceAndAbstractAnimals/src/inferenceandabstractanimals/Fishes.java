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
public abstract class Fishes extends Animals
{
    boolean isFreshWater;

    public Fishes(boolean isFreshWater, String name) 
    {
        super(name);
        this.isFreshWater = isFreshWater;
    }  
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Is in fresh water: " + isFreshWater;
    }
}
