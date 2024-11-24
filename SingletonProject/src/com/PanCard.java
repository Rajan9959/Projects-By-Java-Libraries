package com;

public class PanCard {

	private static PanCard p = null;
	
	public int panId;

	private PanCard(int panId) 
	{
		this.panId = panId;
		System.out.println("Pan card number : "+panId);
	}
	
	public static PanCard createPan(Customer c)
	{
		if (c.getFatherName().equalsIgnoreCase("Ram"))
		{
			if (p==null)
			{
				p=new PanCard(12345);
				System.out.println("Pancard created");
			}
			else
			{
				System.out.println("Already pancard created");
			}
		}
		else
		{
			System.out.println("Invalid father name");
		}
		return p;
	}
}
