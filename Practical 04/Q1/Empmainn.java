
package com.mycompany.empmainn;


public class Empmainn {

    public static void main(String[] args) {
         Employee a=new Employee();
          Employee b=new Employee();

          a.setempid(1111);
          a.setempname("Mr Bogdan");
          a.setempdes("manager");

          b.setempid(1221);
          b.setempname("Ms bird");
          b.setempdes("acc");

          System.out.println("empid"+a.getempid());
          System.out.println("empname"+a.getempname());
          System.out.println("empdes"+a.getempdes());

          System.out.println();

             System.out.println("empid"+b.getempid());
          System.out.println("empname"+b.getempname());
          System.out.println("empdes"+b.getempdes());
          
    }
}
