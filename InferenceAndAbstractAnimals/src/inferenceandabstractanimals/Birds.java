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
public abstract class Birds extends Animals
{
    int wingspan;

    public Birds(int wingspan, String name) 
    {
        super(name);
        this.wingspan = wingspan;
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name + ", Wing Span: " + wingspan;
    }
}
