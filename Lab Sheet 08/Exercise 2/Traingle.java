
package com.mycompany.testshapemain;

public class Traingle implements Shape {
    private double base;
      private double height;
       public Traingle(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    public double getBase()
    {
        return base;
    }
    public void setWidth(double width)
    {
        this.base=base;
    }
     public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    @Override
    public double calculateArea()
    {
      return 0.5*base*height;
    }
    @Override
      public double calculatePerimeter()
    {
      return 3*base;
    }
}
