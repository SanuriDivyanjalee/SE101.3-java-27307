
package com.mycompany.prac5_5;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;
    private  double interestRate;
    public BankAccount(String accountNumber,double balance,double interestRate)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.interestRate=interestRate;
    }
    public void setaccno(String accountNumber)
    {
        this.accountNumber=accountNumber;
      
         }
   
     public void setbal(double balance)
     {
         this.balance=balance;
     }
     public String getaccno()
    {
        return accountNumber;
    }
       public double getbal()
    {
        return balance;
    }
     public abstract double calculateInterest();
               
    
}
