package atmProject;

import java.util.Scanner;

public class AtmDriver 
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		AtmMain a=new AtmMain();
		while(true)
		{
			System.out.println("Enter your choice : \n 1.deposit \n 2.withdraw \n 3.showBalance \n 4.Exit ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:System.out.print("Enter Amount to deposit : ");
					int deposit=sc.nextInt();
					a.deposit();
					break;
					
			case 2:System.out.println("Enter Amount to Withdraw : ");
					int withdraw=sc.nextInt();
					a.withdraw();
					break;
					
			case 3:a.showBalance();
					break;
					
			case 4:System.out.println("Thank you for Visiting :)");
					break;
					
			default :System.out.println("Please Enter valid Input : ");
			}
		}
		
	}
}
