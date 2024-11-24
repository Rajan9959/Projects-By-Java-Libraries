package com;

public class AadharCard {

	private static AadharCard a = null;
	
	public long aadharNo;

	private AadharCard(long aadharNo) 
	{
		this.aadharNo = aadharNo;
		System.out.println("Aadhar number : "+aadharNo);
	}
	
	public static AadharCard createAadharCard()
	{
		if (a==null)
		{
			a=new AadharCard(12345667l);
		}
		else
		{
			System.out.println("Aadhar already created");
		}
		return a;
	}
	
	
}
