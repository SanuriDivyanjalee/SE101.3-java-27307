
package com.mycompany.prac5;


public class InterfaceImplemented implements MyFirstInterface {
    @Override
    public void display()
    {
        /*3.no it is not possible to change x because the variable x is a constant 
        inside the interface */
        x=5;
        System.out.println("value of x "+x);
    }
    
}
