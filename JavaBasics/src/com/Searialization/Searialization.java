package com.Searialization;

import java.io.File;
import java.io.IOException;

public class Searialization 
{
	public static void main(String[] args) 
	{
		String path="E:\\Searialization\\java.txt";
		File file=new File(path);
		try
		{
			boolean res=file.createNewFile();
			System.out.println("file created="+res);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
    }

}
