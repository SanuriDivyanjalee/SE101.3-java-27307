
package com.mycompany.volumemain;

public class Volumemain {

    public static void main(String[] args) {
       CylindricalContainer c=new CylindricalContainer(14.8,7.4);
        System.out.println("Volume of the container is "+c.volume());
        /*output:
        Volume of the container is 2549.5883721656805
        */
    }
}
