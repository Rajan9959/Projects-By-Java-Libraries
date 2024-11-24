package com;

public class User {
	
	public String holderName;
	public int age;
	public int mobileNo;
	public String fatherName;
	
	
	public User(String holderName, int age, int mobileNo, String fatherName) 
	{
		this.holderName = holderName;
		this.age = age;
		this.mobileNo = mobileNo;
		this.fatherName = fatherName;
	}
	public void display()
	{
		System.out.println("Holder Name : "+holderName);
		System.out.println("Age : "+age);
		System.out.println("Mobile Number : "+mobileNo);
		System.out.println("Father Name : "+fatherName);
		BankAccount.CreateObject();
		Voter.createVoter(new User("Raj",25,1234, "Tiger"));
		PanCard.createPan(new User("Raj",25,1234,"Tiger"));
	}
	public static void main(String [] args)
	{
		User u1 = new User("Raj", 25, 1234, "Tiger");
		u1.display();
	}
}
