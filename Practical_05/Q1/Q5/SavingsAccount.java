
package com.mycompany.prac5_5;


public class SavingsAccount extends BankAccount{
    public static final double INTEREST_RATE=0.12;
    public SavingsAccount(String accountNumber,double balance)
    {
        super(accountNumber,balance,INTEREST_RATE);
    }

  
    @Override
    public double calculateInterest()
    {
        return getbal()*INTEREST_RATE;
    }
    
}
