package com.Wrapper;

import java.util.ArrayList;

public class ProgramAutoBoxing 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(34);
		a1.add(39.8);
		a1.add('C');
		a1.add(true);
		for(Object ob:a1)
		{
			System.out.println(ob);
			System.out.println(ob.hashCode());
		}
		
	}

}
