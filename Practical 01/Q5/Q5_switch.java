
package com.mycompany.q5_switch;

public class Q5_switch {

    public static void main(String[] args) {
        	char grade ='A';
	 switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
	break;
	case 'D' :
	System.out.println("You passed");
	case 'F' :
	System.out.println("Better try again");
	break;
	default :
            System.out.println("Invalid grade");
	}
	System.out.println("Your grade is " + grade);
        /* the output of this code is:
        Excellent!
        Your grade is A
        */

    }
}
