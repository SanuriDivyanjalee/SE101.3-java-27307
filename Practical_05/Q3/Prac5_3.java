
package com.mycompany.prac5_3;


public class Prac5_3 {

    public static void main(String[] args) {
       /* This code will not compile because the Undergraduate class
        cannot be created.This is because the Student class is declared as final,
 which means that it cannot be extended by another class.
 Therefore, the Undergraduate class cannot be created.*/
        Undergraduate student = new Undergraduate();
    }
}
