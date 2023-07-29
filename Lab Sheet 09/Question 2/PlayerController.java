
package com.mycompany.lifegame;
import java.util.Scanner;
public abstract class PlayerController {
     public abstract void moveUp();
     public abstract void moveDown();
     public abstract void moveLeft();
     public abstract void moveRight();
    public void processInput()
    {
        Scanner sc=new Scanner(System.in);
        String input;
        while(true)
        {
            System.out.println("Enter direction u-up d-down l-left r-right");
            input=sc.nextLine();
            if(input.equals("u"))
            {
                moveUp();
            }
            else if(input.equals("d"))
            {
                moveDown();
            }
              else if(input.equals("l"))
            {
                moveLeft();
            }
              else if(input.equals("r"))
            {
                moveRight();
            }
            else
              {
                  System.out.println("invalid");
              }
        }
    }
}
