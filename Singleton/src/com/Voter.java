package com;

public class Voter 
{

	public static Voter v=null;

	public int vId;
	
	private Voter(int vId) 
	{
		this.vId = vId;
		System.out.println("Voter Id is : "+vId);
	}
	
	public static void createVoter(User u)
	{
		if (u.age>=18)
		{
			if(v == null)
			{
				v = new Voter(2536);
			}
			else
			{
				System.out.println("Voter Id is alresdy created");
			}
			
		}
		else
		{
			System.out.println("Not eligible for voting");
		}
	}
}
