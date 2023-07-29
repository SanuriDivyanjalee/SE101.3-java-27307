
package com.mycompany.q5_removingbreak;

public class Q5_removingbreak {

    public static void main(String[] args) {
       char grade ='A';
	 switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!");
	case 'D' :
	System.out.println("You passed");
	case 'F' :
	System.out.println("Better try again");
	break;
	default :
            System.out.println("Invalid grade");
	}
	System.out.println("Your grade is " + grade);
        /*the output if we remove the break after case 'A' is:
        Excellent!
        You passed
        Better try again
        Your grade is A
        The above result comes because when we remove break the next line of case 'D' prints 
        also since there is no break statement after case 'D' the line also excecutes and 
        since there is a break statement after case 'F' it will get out of the switch case
        */
    }
}
