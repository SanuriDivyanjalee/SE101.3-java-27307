
package com.mycompany.prac5_4;


public class Circle extends Shape {
	protected double r;
	protected static final double PI =3.1415926535;
	public Circle() 
        {
            
            r = 6.0; 
        }
        @Override
	public double area() { 
            return PI * r * r; 
        
        }
}

