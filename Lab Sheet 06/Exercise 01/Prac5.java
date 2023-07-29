
package com.mycompany.prac5;
public class Prac5 {

    public static void main(String[] args) {
    
 InterfaceImplemented i = new InterfaceImplemented();
    System.out.println("The value of x is: " + i.x);
    // This will generate an error
    i.x = 20;
/*1.there is no difference eventhough we add public static final keywords or not because
    inside an interface all variables are considered as final
    
 2.there is no difference eventhough we add abstract keyword or not because
    inside an interface all methods are considered as abstract.
3.no it is not possible to change x because the variable x is a constant (static)
        inside the interface */
    }
}
