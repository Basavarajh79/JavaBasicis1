package com.Searialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SearializationExportData 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(14,"ABC");
		String path="E:\\Searialization\\java.txt";
		File file=new File(path);
		try 
		{
			FileOutputStream fout=new FileOutputStream(file);
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(e1);
			System.out.println("object written");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
