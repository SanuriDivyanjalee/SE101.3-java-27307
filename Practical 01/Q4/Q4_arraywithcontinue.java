
package com.mycompany.q4_arraywithcontinue;

public class Q4_arraywithcontinue {

    public static void main(String[] args) {
                    int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         if( x == 30 ){
	    continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.print("I’m  out of the Loop now");
    /* the output of the code if we use continue statement is:
          10
          20
          40
          50
          I’m  out of the Loop now
         
          The above result is because it skips the value of x if it is equal to 30*/
    }
}
