package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class DemoFile 
{
	public static void main(String[] args) 
	{
		String path="E:\\FileHandling\\java.txt";
		File f1=new File(path);
		try
		{
			boolean res=f1.createNewFile();
			System.out.println("file created="+res);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
