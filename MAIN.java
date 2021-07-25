package com.bankapplicationproject;
import java.util.Scanner;
import java.util.Random;
public class MAIN {
    
    
    public static void main(String args[])
    {
        Random random=new Random();
        
        
    BANKAPPLICATION b=new BANKAPPLICATION();
       
        
        Scanner sc=new Scanner(System.in);
        System.out.println("*****************Welcome to AVS Bank*********************");
        int t=1;
        while(t==1)
        {
        System.out.println("Are you exsisting costumer of this bank then press 1");
        System.out.println("If you are new costumer and want to create account then press 2");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("If you want to deposite the money then press 1");
                System.out.println("If you want to withdraw the money then press 2");
                System.out.println("If you want to print the passbook then press 3");
                int m=sc.nextInt();
                switch(m)
                {
                    case 1:
                        System.out.println("Enter the amount that you want to deposite");
                        long p=sc.nextLong();
                        b.DepositeMoney(p);
                        break;
                     case 2:
                        System.out.println("Enter the amount that you want to withdraw");
                        long q=sc.nextLong();
                        b.WithDrawlMoney(q);
                        break;
                    case 3:
                        b.PrintPassBook();
                        break;
                    
                       
                        
                }break;
            case 2:
                System.out.println("Enter your name");
                b.settName(sc.next());
                System.out.println("Enter your phone number");
                long ph=sc.nextLong();
                b.setPhno(ph);
                System.out.println("Enter your email");
               String em=sc.next();
                b.settEmail(em);
                System.out.println("Enter the amount that you want to deposite for opening the bank account");
               long bl=sc.nextLong();
                b.setBalance(bl);
                if(bl<2000)
                {  
                    System.out.print("Sorry!! Account will not be created beacuse Amount is less than 2000.");
                    
                     
                }
                else
                {
                    System.out.println("You have successfully created the account and here is your details");
                    System.out.println("Customer Name: "+b.getName());
                    System.out.println("Customer PhoneNumber: "+b.getPhno());
                    System.out.println("Customer Email_Id: "+b.getEmail());
                    System.out.println("Current Balance: "+b.getBalance());
                    long ac=random.nextInt(1000000000);
                    b.setAccount_No(ac);
                    System.out.println("Account Number "+b.getAccount_No());
                    
                }
                break;
                
            default:
              System.out.println("Please select the valid option");
              
        }
        System.out.println("If you want to go in main menu then press 1");
        int s=sc.nextInt();
        if(t==s)
            continue;
        else
            System.exit(0);
        
        }
               
 
    }
    
   
}

