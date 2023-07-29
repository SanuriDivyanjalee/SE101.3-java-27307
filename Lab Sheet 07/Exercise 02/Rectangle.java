
package com.mycompany.prac5_4;


public class Rectangle extends Shape {
	private double w, h;
	public Rectangle(double w,double h)
        {
           this.w=w;
           this.h=h;
        }
        @Override
	public double area() 
        { 
            return w * h;
        }
}

