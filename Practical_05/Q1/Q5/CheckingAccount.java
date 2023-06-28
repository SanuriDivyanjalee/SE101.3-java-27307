
package com.mycompany.prac5_5;

public class CheckingAccount extends BankAccount{
     public static final double INTEREST_RATE=0.02;
     public CheckingAccount(String accountNumber,double balance)
     {
         super(accountNumber,balance,INTEREST_RATE);
     }
     @Override
     public double calculateInterest()
     {
         return getbal()*INTEREST_RATE;
     }
    
}
