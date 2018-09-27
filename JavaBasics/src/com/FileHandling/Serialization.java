package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(456,"CDE");
		String path="E:\\FileHandling\\java.txt";
		File f1=new File(path);
		try 
		{
			FileOutputStream fout=new FileOutputStream(f1);
			ObjectOutputStream out= new ObjectOutputStream(fout);
			out.writeObject(e1);
			System.out.println("Object Written");
		} 
		catch (Exception e) 
		{
			
			
			e.printStackTrace();
		}
		
	}

}
