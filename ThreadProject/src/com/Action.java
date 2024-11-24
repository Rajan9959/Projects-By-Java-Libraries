package com;

import java.util.Scanner;

public class Action implements ActionInterface 
{


	Scanner sc=new Scanner(System.in);
	public static int availableAmount=1000;
	public static int deposit;
	public static int withdraw;
	
	public void deposit(int deposit)
	{
		if(deposit<0)
		{
			System.out.println("Enter valid Amount to Deposit");
			deposit=sc.nextInt();
		}
		if(deposit>0)
		{
			//System.out.print("Enter Amount you wanted to deposit : ");
			//deposit=sc.nextInt();
			int totalAmount=deposit+availableAmount;
			System.out.println("Total available Balance in your Account : "+totalAmount);
			availableAmount=totalAmount;
			//break;
		}
	}
		
	
	
	public void withdraw(int withdraw)
	{
		int count=0;
		boolean raj=true;
		while(raj) 
		{
			if(withdraw < availableAmount)
			{
					//System.out.println("Enter Amount to Withdraw");
					//withdraw = sc.nextInt();
					availableAmount=availableAmount-withdraw;
					System.out.println("Please wait processing Transaction :)");
					try 
					{
						Thread.sleep(2000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
					System.out.println("You have withdrawn Amount of : "+withdraw);
					System.out.println("After withdrawn Your Total remaining Amount Is : "+availableAmount);
					count++;
					break;
			}
			if(withdraw<0)
			{
				System.out.println("Please Enter valid Amount");
				//throw new EnterValidAmountException("Enter valid Amount ");
				withdraw=sc.nextInt();
				count++;
			}
			if(withdraw>availableAmount)
			{
				System.out.println("Please Enter valid Amount");
				System.out.println("You have only "+(3-count)+" times");
				//throw new InsufficientBalanceException("Insuffucuent Amount ");
				withdraw=sc.nextInt();
				count++;
			}
			if(withdraw==0)
			{
				System.out.println("Please Enter valid Amount");
				System.out.println("You have only "+(3-count)+" times");
				withdraw=sc.nextInt();
				count++;
			}
		}
		if(count==3)
		{
			raj=false;
			System.out.println("Blocked");
		}
		
		

		
	}
	
	
	public void showBalance()
	{
		System.out.println(availableAmount);
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
