
package com.mycompany.prac3empmain;

public class Employee {
      private String name;
    private float bsal;
    private float bonus;
    private float bamnt;
     public void setname(String n)
   {
       name=n;
   }   
     public String getname()
   {
       return name;
   }
      public void setsal(float s)
   {
       bsal=s;
   } 
      public float getsal()
   {
       return bsal;
       
   }  
      public Employee(float b)
      {
          bonus=b;
      }
      public void display()
      {
          System.out.println("Bonus: "+bonus);
      }
      public void setbamnt()
      {
           float tot;
          tot=bonus+bsal;
          System.out.println("Bonus amount: "+tot);
}
}
