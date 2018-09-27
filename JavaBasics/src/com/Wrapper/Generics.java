package com.Wrapper;

import java.util.ArrayList;

public class Generics 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("java");
		//a1.add(new Student());
		//a1.add(new Employee());
		//a1.add(45);
		//a1.add(5.6);
		for(String ob:a1)
		{
			System.out.println(ob);
		}
	}

}
