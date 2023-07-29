

package com.mycompany.fileh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Fileh {

    public static void main(String[] args) {
    
        try
        {
            File file=new File("nonexistent.txt");
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
         
        }
        
        catch(FileNotFoundException e)
              {
                System.out.println("Error:file not found");
                }
    }
}
