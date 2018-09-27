package com.CollectionSet;

import java.util.LinkedHashSet;


public class Program1 
{
	public static void main(String[] args) 
	{
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("A");
		hs.add("A");
		hs.add("B");
		hs.add("A");
		hs.add(null);
		hs.add(null);
		hs.add("java");
		hs.add("sql");
		for(Object ob:hs)
		{
			System.out.println(ob);
		}
	}

}
