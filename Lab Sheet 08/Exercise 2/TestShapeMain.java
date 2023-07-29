
package com.mycompany.testshapemain;

public class TestShapeMain {

    public static void main(String[] args) {
       Circle c=new Circle(7);
        System.out.println("Area of the circle is "+c.calculateArea());
        System.out.println("Perimeter of the circle is "+c.calculatePerimeter());
        Rectangle r=new Rectangle(5,3);
        System.out.println("Area of the rectangle is "+r.calculateArea());
        System.out.println("Perimeter of the rectangle is "+r.calculatePerimeter());
          Traingle t=new Traingle(6,3);
        System.out.println("Area of the traingle is "+t.calculateArea());
        System.out.println("Perimeter of the traingle is "+t.calculatePerimeter());
        /*output:
        Area of the circle is 153.93804002589985
        Perimeter of the circle is 43.982297150257104
        Area of the rectangle is 15.0
        Perimeter of the rectangle is 16.0
        Area of the traingle is 9.0
        Perimeter of the traingle is 18.0
        */
    }
}
