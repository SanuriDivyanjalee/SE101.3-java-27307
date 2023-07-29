
package com.mycompany.prac3empmain;

public class Prac3empmain {

    public static void main(String[] args) {
         Employee e3=new Employee(10000.0f);
       e3.setname("Bogdan");
       e3.setsal(50000.0f);
       
        System.out.println("Employee name: "+e3.getname());
        System.out.println("Basic salary: "+e3.getsal());
        e3.display();
       e3.setbamnt();
    }
}
