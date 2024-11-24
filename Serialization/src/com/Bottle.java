package com;

import java.io.Serializable;

public class Bottle implements Serializable{

	private String brand;
	private int cost;
	private int capacity;
	private String type;
	
	public Bottle()
	{
		
	}

	public Bottle(String brand, int cost, int capacity, String type) 
	{
		this.brand = brand;
		this.cost = cost;
		this.capacity = capacity;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void display()
	{
		System.out.println("Brand of the Bolle : "+getBrand());
		System.out.println("Cost of the Bottle : "+getCost());
		System.out.println("Capacity of the Bottle : "+getCapacity());
		System.out.println("Type of the Bottle : "+getType());
	}
	
}
