package atmProject;

import java.util.Scanner;

public class AtmMain implements Atm{

	public static int availableAmount;
	public static int deposit;
	public static int withdraw;
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void deposit() 
	{
		availableAmount = 1000;
		int count=0;
		while(true)
		{
			
			if(deposit > 0)
			{
				int totalAmount=deposit+availableAmount;
				System.out.println("Total Balance in your Account is : "+totalAmount);
				availableAmount=totalAmount;
				break;
			}
			if(deposit < 0)
			{
				System.out.println("Please Enter Valid Amount : ");
				deposit=sc.nextInt();
				//count++;
			}
			if(deposit == 0)
			{
				System.out.println("Please Enter Valid (0) Amount : ");
				deposit=sc.nextInt();
				//count++;
			}
			if(count==3)
			{
				System.out.println("You have reached your limits so blocked for 24 hours");
			}
		}
		
	}
	
	@Override
	public void withdraw() 
	{
		int count=0;
		while(true)
		{
			if(withdraw <= availableAmount)
			{
				int withdrawalAmount = availableAmount-withdraw;
				System.out.println("You have withdrawn : "+withdraw);
				availableAmount=withdrawalAmount;
			}
			else if(withdraw < 0)
			{
				System.out.println("Please Enter valid Amount ");
				withdraw=sc.nextInt();
				count++;
			}
			else if(withdraw > availableAmount)
			{
				System.out.println("Please Enter valid Amount ");
				withdraw=sc.nextInt();
				count++;
			}
			else
			{
				System.out.println("Please Enter valid Amount ");
				withdraw=sc.nextInt();
				count++;
			}
			if(count==3)
			{
				System.out.println("You have reached your limits so blocked for 24 hours");
			}
		}
		
	}
	
	@Override
	public void showBalance() 
	{
		System.out.println("Total Balance in your Account is : "+availableAmount);
		
	}
	
	
}
