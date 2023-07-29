
package com.mycompany.prac5_5;

public class Prac5_5 {

    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount("455566",20000000);
        CheckingAccount ca=new CheckingAccount("945678",1000000);
        double savingInterest=sa.calculateInterest();
        double checkingInterest=ca.calculateInterest();
        double totalInterest=savingInterest+checkingInterest;
        System.out.println("The interest for savings account is "+savingInterest);
        System.out.println("The interest for checking account is "+checkingInterest);
        System.out.println("The total interest is "+totalInterest);
        /*output:
        The interest for savings account is 2400000.0
        The interest for checking account is 20000.0
        The total interest is 2420000.0
        */
    }
}
