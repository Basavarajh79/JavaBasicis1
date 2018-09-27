package com.Searialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SearializationImportData 
{
	public static void main(String[] args) 
	{
		String path="E:\\Searialization\\java.txt";
		File file=new File(path);
		try
		{
			FileInputStream fin=new FileInputStream(file);
			ObjectInputStream in=new ObjectInputStream(fin);
			Object ob=in.readObject();
			if(ob instanceof Employee)
			{
				Employee e1=(Employee)ob;
				System.out.println("id="+e1.id);
				System.out.println("name="+e1.name);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
    }

}
