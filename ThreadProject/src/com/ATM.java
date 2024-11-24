package com;

import java.util.Scanner;

public class ATM implements Bank
{

	 public static int accountBalance = 1000;
	 
	 public void deposit(int depositedAmount)
	 {
	  if(depositedAmount < 0)
	  {
	    int count = 0;
	    for(int i = 1; i <= 3; i++)
	    {
	     System.out.print("Please enter the correct amount : ");
	     Scanner scanner = new Scanner(System.in);
	     depositedAmount = scanner.nextInt();
	     if(depositedAmount > 0)
	     {
	      int totalBalanceAterDeposit = depositedAmount + accountBalance;
	      try 
	       {
	       Thread.sleep(3000);
	       } 
	       catch (InterruptedException ie) 
	       {
	        System.out.println("IE Handled");
	       }
	      System.out.println("The account balance after the money deposited : "+totalBalanceAterDeposit);
	      System.out.println();
	      accountBalance = totalBalanceAterDeposit;
	      break;
	     }
	     else
	     {
	      count++;
	     }
	    }
	    if(count == 3) 
	    {
	     System.out.println();
	     System.out.println("Your account will be blocked for 24 hrs");
	     throw new InvalidAmountException("The amount you have entered is below zero and it is invalid");
	    }
	  }
	  else
	  {
	   int totalBalanceAterDeposit = depositedAmount + accountBalance;
	   try 
	    {
	    Thread.sleep(3000);
	    } 
	    catch (InterruptedException ie) 
	    {
	     System.out.println("IE Handled");
	    }
	   System.out.println("The account balance after the money deposited : "+totalBalanceAterDeposit);
	   accountBalance = totalBalanceAterDeposit;
	  }
	 }
	 
	 public void withdraw(int withdrawalAmount)
	 {
	  if(withdrawalAmount > accountBalance)
	  {
	   int count = 0;
	   for(int i = 1; i <= 3; i++)
	   {
	    System.out.print("Please enter the correct amount : ");
	    Scanner scanner = new Scanner(System.in);
	    withdrawalAmount = scanner.nextInt();
	    if(withdrawalAmount < accountBalance)
	    {
	     int totalBalance = accountBalance - withdrawalAmount;
	     try 
	      {
	      Thread.sleep(3000);
	      } 
	      catch (InterruptedException ie) 
	      {
	      System.out.println("IE Handled");
	      }
	     System.out.println("The account balance after the money withdrawal : "+totalBalance);
	     accountBalance = totalBalance;
	     break;
	    }
	    else
	    {
	     count++;
	    }
	   }
	   
	   if(count == 3) 
	   {
	    System.out.println();
	    System.out.println("Your account will be blocked for 24 hrs");
	    throw new InsufficientBalanceException("The amount you want to withdraw is greater than the accountBalance");
	   }
	   
	  }
	  else
	  {
	   int totalBalance = accountBalance - withdrawalAmount;
	   try 
	    {
	    Thread.sleep(3000);
	    } 
	    catch (InterruptedException ie) 
	    {
	    System.out.println("IE Handled");
	    }
	   System.out.println("The account balance after the money withdrawal : "+totalBalance);
	   accountBalance = totalBalance;
	  }
	 }
	 
	 public void showbalance()
	 {
	  try 
	   {
	   Thread.sleep(3000);
	   } 
	   catch (InterruptedException ie) 
	   {
	   System.out.println("IE Handled");
	   }
	  System.out.println("The accountBalance : "+accountBalance);
	 }

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShowBalance() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void withdraw() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deposit() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void ShowBalance() {
//		// TODO Auto-generated method stub
//		
//	}
	}

