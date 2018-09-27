package com.CollectionSet;

import java.util.HashSet;
import com.CollectionArrayLIst.Student;

public class Program 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		Student s1=new Student(12,"ABC");
		Student s2=new Student(14,"DEF");
		hs.add(s1);
		hs.add(s2);
		for(Object ob:hs)
		{
			System.out.println(ob);
		}
	}

}
