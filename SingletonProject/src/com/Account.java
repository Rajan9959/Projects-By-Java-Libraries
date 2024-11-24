package com;

public class Account {

	private static Account a=null;
	
	public long accountNo;

	private Account(long accountNo) 
	{
		this.accountNo = accountNo;
		System.out.println("Account No : "+accountNo);
	}
	
	public static Account createAccount()
	{
		if(a==null)
		{
			a=new Account(1234555l);
		}
		else
		{
			System.out.println("Already account is created");
		}
		return a;
	}
	
	
}
