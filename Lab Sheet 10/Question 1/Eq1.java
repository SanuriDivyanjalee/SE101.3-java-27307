
package com.mycompany.eq1;
import java.util.Scanner;
public class Eq1 {

    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
       try
       {
           System.out.println("Enter numerator: ");
           x=sc.nextInt();
           System.out.println(" Enter denominator: ");
           y=sc.nextInt();
           z=x/y;
           System.out.println("Division is "+z);
       }
       catch(ArithmeticException e)
               {
                   System.out.println("Division by Zero");
               }    
               
           
    }
}
