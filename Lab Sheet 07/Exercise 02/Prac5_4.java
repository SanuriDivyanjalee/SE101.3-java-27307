package com.mycompany.prac5_4;
public class Prac5_4 {

    public static void main(String[] args) {
       Rectangle r1=new Rectangle(6,5);
       double recArea=r1.area();
         System.out.println("Area of rectangle is "+recArea);
           Circle c1=new Circle(7);
           double circleArea=c1.area();
           c1.display();
        System.out.println("Area of the circle is "+circleArea);
        
    }
}
