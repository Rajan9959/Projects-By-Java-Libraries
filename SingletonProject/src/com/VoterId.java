package com;

public class VoterId {

	private static VoterId v=null;
	
	public int voterId;

	private VoterId(int voterId) 
	{
		this.voterId = voterId;
		System.out.println("Voter id Number : "+voterId);
	}
	
	public static VoterId createVoterId(Customer c)
	{
		if (c.getAge()>=18)
		{
			if (v==null)
			{
				v=new VoterId(12344);
				System.out.println("Voter id is created");
			}
			else
			{
				System.out.println("Already voterid is created");
			}
		}
		else
		{
			System.out.println("Not eligible for votercard");
		}
		return v;
	}
}
