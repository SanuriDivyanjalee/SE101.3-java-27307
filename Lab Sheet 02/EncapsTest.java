

package com.mycompany.encapstest;

public class EncapsTest {

    public static void main(String[] args) {
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mario");
         System.out.println("Employee Name: " + obj.getEmpName());
       /* Output:
         Employee Name: Mario
         */
    }
}
