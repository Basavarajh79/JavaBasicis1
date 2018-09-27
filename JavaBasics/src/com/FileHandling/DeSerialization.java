package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization 
{
	public static void main(String[] args) 
	{
		String path="E:\\FileHandling\\java.txt";
		File f1=new File(path);
		try
		{
			FileInputStream fin=new FileInputStream (f1);
			ObjectInputStream in=new ObjectInputStream(fin);
			Object ob=in.readObject();
			if(ob instanceof Employee)
			{
				Employee e2=(Employee)ob;
				System.out.println("id="+e2.id);
				System.out.println("name="+e2.name);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
