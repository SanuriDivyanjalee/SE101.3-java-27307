
package com.mycompany.testenhanceforloop;

public class TestEnhanceForLoop {

    public static void main(String[] args) {
       	 int [] numbers = {10, 20, 30, 40, 50};
      		for(int x : numbers ){
        			 System.out.print( x );
         			System.out.print(",");//; missing
      		}
	 System.out.print("\n");
      	String [] names ={"James", "Larry", "Tom", "Lacy"};//; missing
      		for( String name : names ) {
        		 	System.out.print( name );
         			System.out.print(",");
                }
                //} missing
	

    }
}

