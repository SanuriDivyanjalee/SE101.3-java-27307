
package com.mycompany.lab6_ex;


public class Lab6_ex {

    public static void main(String[] args) {
         int arr[]=new int[5];
       try
       {
            arr[5]=25;
            System.out.println("last element "+arr[5]);
            
        }
       catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index error"); 
        
    }
    }
}