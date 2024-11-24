package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MarkerDriver {

	public static void main(String[] args) {
		
		Marker m=new Marker("Cello",50,"Red");
		
		try {
			//SERIALISATION
			FileOutputStream fos=new FileOutputStream("Marker.txt");
			try {
				ObjectOutputStream os=new ObjectOutputStream(fos);
				os.writeObject(m);
				os.flush();
				os.close();
				System.out.println("Data stored");
				
				// DESERIALISATION
				FileInputStream fis=new FileInputStream("Marker.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				try {
					// DOWNCASTING
					Marker mar=(Marker)ois.readObject();
					System.out.println(mar.getBrand());
				} catch (ClassNotFoundException e) {
					System.out.println("Class not Found");
				}
			} catch (IOException e) {
				System.out.println("Data not stored");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
}
