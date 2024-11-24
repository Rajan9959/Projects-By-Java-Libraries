package com;

public class PanCard {

	public static PanCard p=null;
	
	public int panId;
	
	private PanCard(int panId)
	{
		this.panId=panId;
		System.out.println("PanCard no : "+panId);
	}
	
	public static void createPan(User u)
	{
		if (u.fatherName.equalsIgnoreCase("Tiger"))
		{
			if (p==null)
			{
				p=new PanCard(12345);
			}
			else
			{
				System.out.println("Pancrad is already created");
			}
		}
		else
		{
			System.out.println("Father names are  not same");
		}
	}
}
