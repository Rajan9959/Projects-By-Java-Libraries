package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BottleDriver {

	public static void main(String[] args) {
		
		Bottle b=new Bottle("KINLEY",20,1000,"Silver");
		
		try {
			//SERIALISATION
			FileOutputStream fos=new FileOutputStream("Bottle.txt");
			try {
				ObjectOutputStream ops=new ObjectOutputStream(fos);
				ops.writeObject(b);
				ops.flush();
				ops.close();
				System.out.println("Data Stored");
				
				// DESERIALIZATION
				FileInputStream fis=new FileInputStream("Bottle.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				try {
					Bottle btl=(Bottle)ois.readObject();
					System.out.println(btl.getBrand());
				} catch (ClassNotFoundException e) {
					System.out.println("Class not Found");
				}
			} catch (IOException e) {
				System.out.println("Data not stored");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
