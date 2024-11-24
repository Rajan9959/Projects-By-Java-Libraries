package com;

public class BankAccount {
	
	public static BankAccount b = null;
	
	public int accountNo;
	
	private BankAccount(int accountNo)
	{
		this.accountNo=accountNo;
		System.out.println("Account Number : "+accountNo);
	}
	
	public static void CreateObject()
	{
		if (b==null)
		{
			b=new BankAccount(12345);
		}
		else
		{
			System.out.println("Bank Account is alredy created");
		}
	}
}
