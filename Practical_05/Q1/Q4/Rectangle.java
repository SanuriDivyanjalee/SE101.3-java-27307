
package com.mycompany.prac5_4;


public class Rectangle extends Shape {
	protected double w, h;
	public Rectangle()
        {
            w = 3.0; h=7.0; 
        }
        @Override
	public double area() 
        { 
            return w * h;
        }
}

