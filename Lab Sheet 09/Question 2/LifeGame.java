
package com.mycompany.lifegame;

public class LifeGame {

    public static void main(String[] args) {
       
    KeyboardController c=new KeyboardController();
         
        c.processInput();
        /*Output:
        Enter direction u-up d-down l-left r-right
        d
        Moving down
        Enter direction u-up d-down l-left r-right
        l
        Moving left
        Enter direction u-up d-down l-left r-right
        r
        Moving right
        */
    }
}
