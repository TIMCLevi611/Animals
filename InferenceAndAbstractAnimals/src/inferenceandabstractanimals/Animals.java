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
public abstract class Animals 
{
    String name;

    public Animals(String name) 
    {
        this.name = name;
    }  

    @Override
    public String toString() 
    {
        return "Name: " + name;
    }
    
    
}
