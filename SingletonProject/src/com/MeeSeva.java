package com;

import java.util.Scanner;

public class MeeSeva 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		boolean start = true;
		while(start)
		{
			System.out.println("Enter your choice : \n 1.Account \n 2.AadharCard \n 3.VoterId \n 4.Pancard \n 5.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					Account.createAccount();
				}
				break;
				case 2:
				{
					AadharCard.createAadharCard();
				}
				break;
				case 3:
				{
					System.out.println("Enter your Name");
					String name=sc.next();
					System.out.println("Enter your age");
					int age=sc.nextInt();
					System.out.println("Enter your Mobile No");
					long mobile=sc.nextLong();
					System.out.println("Enter your Gender");
					char gender=sc.next().charAt(0);
					System.out.println("Enter your Father name");
					String fname=sc.next();
					
					VoterId.createVoterId(new Customer(name,age,mobile,gender,fname));
				}
				break;
				case 4:
				{
					System.out.println("Enter your Name");
					String name=sc.next();
					System.out.println("Enter your age");
					int age=sc.nextInt();
					System.out.println("Enter your Mobile No");
					long mobile=sc.nextLong();
					System.out.println("Enter your Gender");
					char gender=sc.next().charAt(0);
					System.out.println("Enter your Father name");
					String fname=sc.next();
					PanCard.createPan(new Customer(name,age,mobile,gender,fname));
				}
				break;
				case 5:
				{
					start=false;
					System.out.println("Thank you Nikhil :)");
				}
				break;
				default :
				{
					System.out.println("Enter valid input");
				}
			}
		}

	}	
}
