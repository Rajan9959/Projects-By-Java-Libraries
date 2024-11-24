package com;

public class Customer {

	private String name;
	private int age;
	private long mobileNo;
	private char gender;
	private String fatherName;
	
	public Customer()
	{
		
	}

	public Customer(String name, int age, long mobileNo, char gender, String fatherName) 
	{
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.fatherName = fatherName;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherName() {
		return fatherName;
	}
}
