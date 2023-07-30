
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
            System.out.println("Enter direction u-up d-down l-left r-right /-exit from game");
            input=sc.nextLine();
            if(input.equalsIgnoreCase("u"))
            {
                moveUp();
            }
            else if(input.equalsIgnoreCase("d"))
            {
                moveDown();
            }
              else if(input.equalsIgnoreCase("l"))
            {
                moveLeft();
            }
              else if(input.equalsIgnoreCase("r"))
            {
                moveRight();
            }
              else if(input.equals("/"))
              {
                  break;
              }
            else
              {
                  System.out.println("invalid");
              }
        }
    }
}
