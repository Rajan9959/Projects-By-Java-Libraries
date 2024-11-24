package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee emp=new Employee("Rahul",101,55000);
		
		try {
			//SERIALISATION
			FileOutputStream fos=new FileOutputStream("Employee.txt");
			
			try {
				ObjectOutputStream os=new ObjectOutputStream(fos);
				
				os.writeObject(emp);
				os.flush();
				os.close();
				System.out.println("Data stored");
				
				//DESERIALISATION
				FileInputStream fis=new FileInputStream("Employee.txt");
				// TO READ OBJECT TYPE OF DATA
				ObjectInputStream ois=new ObjectInputStream(fis);
				try {
					// DOWNCASTING
					Employee empDet=(Employee)ois.readObject();
					System.out.println(empDet.getSal());
				} catch (ClassNotFoundException e) {
					System.out.println("Class not Found");
				}
				
			} catch (IOException e) {
				System.out.println("Data not stored");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not created");
		}
		
	}
}
