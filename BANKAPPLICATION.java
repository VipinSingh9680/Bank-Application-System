
package com.bankapplicationproject;
public class BANKAPPLICATION {
    private String Name;
    private long Phno;
    private String Email;
    private long Account_No;
    private double Balance;
    public void DepositeMoney(double Balance)
    {
        this.Balance+=Balance;
        System.out.println(Balance+" deposited Succesfully and the current Balance is "+this.Balance);
    }
     public void WithDrawlMoney(double Balance)
    {
        if(this.Balance-Balance<0)
        System.out.println(Balance+" can not be withdraw because only "+this.Balance+"  is left");
                
        else
        {
            this.Balance-=Balance;
            System.out.println("Money withdrawl successfully "+Balance+" and current balance is "+this.Balance);
        }
    }
     public void PrintPassBook()
     {
         System.out.println("Your Current Balance is "+this.Balance);
     }
      public void settName(String Name)
    {
        this.Name=Name;
    }
    public String getName()
    {
        return this.Name;
    }
      public void setPhno(long Phno)
    {
        this.Phno=Phno;
    }
     public long getPhno()
    {
        return this.Phno;
    }
      public void settEmail(String Email)
    {
        this.Email=Email;
    }
      public String getEmail()
    {
        return this.Email;
    }
      public void setAccount_No(long Account_No)
    {
        this.Account_No=Account_No;
    }
       public long getAccount_No()
    {
        return this.Account_No;
    }
    public void setBalance(double Balance)
    {
        this.Balance=Balance;
    }
    
    public double getBalance()
    {
        return this.Balance;
    }
}

    

