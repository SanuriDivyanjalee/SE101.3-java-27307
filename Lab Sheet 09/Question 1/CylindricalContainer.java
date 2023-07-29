
package com.mycompany.volumemain;

public class CylindricalContainer extends Container{
    private double height,radius;
    public CylindricalContainer(double h,double r)
    {
        height=h;
        radius=r;
    }
    @Override
    public double volume()
    {
        return 3.1459f*radius*radius*height;
    }
    
}
