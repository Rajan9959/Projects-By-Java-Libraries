package com;

import java.util.Scanner;

public class ATMMainClass 
{

	 public static void main(String[] args) 
	 {
		  ATM atm = new ATM();
		  boolean condition = true;
		  final String username = "Admin";
		  final int userPassword = 123;
		  Scanner s  = new Scanner(System.in);
		  System.out.print("Enter your username : ");
		  String name = s.next();
		  if(name.equals(username))
		  {
			  System.out.print("Enter the password : ");
			  int password = s.nextInt();
			   if(password == userPassword)
			   {
				    while(condition)
				    {
				    	System.out.println("Enter the operation you want to perform : \n 1) Deposit \n 2) Withdrawal \n 3) ShowBalance \n 4) Exit");
				     	int operation = s.nextInt();
					     switch(operation)
					     {
					     case 1 : System.out.print("Enter the amount you want to deposit : ");
					        int depositedAmount = s.nextInt();
					        atm.deposit(depositedAmount);
					        System.out.println();
					        break;
					       
					     case 2 : System.out.print("Enter the amount you want to withdraw : ");
					           int withdrawalAmount = s.nextInt();
					           atm.withdraw(withdrawalAmount);
					           System.out.println();
					           break;
					           
					     case 3 : atm.showbalance();
					         System.out.println();
					        break;
					        
					     case 4 : System.out.println("Thank you...  :)");
					        condition = false;
					        break;
					        
					     default : System.out.println("Enter the correct operation in the given options!!!");
					     }
				    }
			   }	
			   else
			   {
			    System.out.println("Invalid password");
			   }
		  }
		  else
		  {
			  System.out.println("Invalid Username");
		  }
		  
	 }
	 
}