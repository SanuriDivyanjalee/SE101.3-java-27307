
package com.mycompany.prac5_3;

public class Undergraduate extends Student{
    /*the outcome of running this code will be a compilation error 
    because the 'final' keyword is used to declare the 'display()' method in the Student class
    also the Undergraduate class is trying to extend the Student class and override the display() method
    which means we cannot override a final method in a subclass.
    */
}
