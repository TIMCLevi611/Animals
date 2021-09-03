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
public abstract class Mammals extends Animals
{
    float bodyTemp;

    public Mammals(float bodyTemp, String name) 
    {
        super(name);
        this.bodyTemp = bodyTemp;
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Body Temp: " + bodyTemp;
    }
}
