package com;

import java.util.Scanner;

public class ActionDriver 
{

	public static void main(String[] args) 
	{
		
		Action ai=new Action();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("-------------------------------------------");
			System.out.println("Press 1 to deposit Amount ");
			System.out.println("Press 2 to withdraw Amount ");
			System.out.println("Press 3 to check Available Balance");
			System.out.println("Press 4 to Exit ");
			System.out.println("-------------------------------------------");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					 		System.out.print("Enter the amount you want to deposit : ");
					 		int deposit = sc.nextInt();
							ai.deposit(deposit);
							break;
				
				
				case 2:
					 		System.out.print("Enter the amount you want to withdraw : ");
					 		int withdraw = sc.nextInt();
							ai.withdraw(withdraw);
							break;
				
				
				case 3:
							ai.showBalance();
							break;
				
				
				case 4:
							System.out.println("Thank you for your patience :)");
							break;
				
				default :System.out.println("Please enter valid Input");
					
			}

		}
		
	}
}
