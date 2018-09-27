package com.CollectionArrayLIst;

import java.util.ArrayList;

public class DemoArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println("size="+a1.size());
		Student s1=new Student(12,"ab");
		Student s2=new Student(14,"ab");
		Student s3=new Student(15,"ab");
		Student s4=new Student(16,"ab");
		Employee e1=new Employee("cd",18);
		Employee e2=new Employee("cd",20);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(e1);
		a1.add(e2);
	    a1.add("java");
	    a1.add("java");
	    a1.add(null);
	    System.out.println("size="+a1.size());
	    for(Object ob:a1)
	    {
	    	System.out.println(ob);
	    }
	    for (int i=0;i<a1.size();i++)
	    {
	    	System.out.println(a1.get(i));
	    }
	}

}
