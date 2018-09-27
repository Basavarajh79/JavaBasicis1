package com.CollectionSet;

import java.util.*;

public class CompareToforTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		Student s1=new Student(12,"AB");
		Student s2=new Student(14,"CD");
		Student s3=new Student(16,"EF");
		Student s4=new Student(18,"GH");
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		for(Object ob:t)
		{
			System.out.println(ob);
		}
	}

}
