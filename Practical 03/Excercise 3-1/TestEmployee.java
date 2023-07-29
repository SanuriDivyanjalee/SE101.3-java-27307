
package com.mycompany.testemployee;


public class TestEmployee {

    public static void main(String[] args) {
      Employee e1 = new Employee();
      e1.setName("John");
e1.setAge(40);
e1.setSalary(50000.0);


System.out.println("Name: " + e1.getName());
System.out.println("Age: " + e1.getAge());
System.out.println("Salary: " + e1.getSalary());
    }
}
