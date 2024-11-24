package com;

import java.io.Serializable;

public class Employee implements Serializable{

	private String name;
	private int id;
	private int sal;
	
	public Employee()
	{
		
	}
	
	public Employee(String name,int id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
	
	public void display()
	{
		System.out.println("Name of the Employee : "+getName());
		System.out.println("Id of the Employee : "+getId());
		System.out.println("Salary of the Employee : "+getSal());
	}
	
}
