package com.CollectionArrayLIst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class DemoArrayList1 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		LinkedList l1=new LinkedList();
		ArrayList a1=new ArrayList();
		System.out.println("size="+a1.size());
		Student s1=new Student(12,"ab");
		Student s2=new Student(14,"ab");
		Student s3=new Student(15,"ab");
		Student s4=new Student(16,"ab");
		Employee e1=new Employee("cd",18);
		Employee e2=new Employee("cd",20);
		l1.add(s1);
		v1.add(s1);
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
	    	if(ob instanceof Student)
	    	{
	    		Student st=(Student)ob;
	    		System.out.println("id="+st.id);
	    		System.out.println("name="+st.name);
	    	}
	    	else if(ob instanceof Employee)
	    	{
	    		Employee eref=(Employee)ob;
	    		System.out.println("eid="+eref.id);
	    		System.out.println("ename="+eref.name);
	    	}
	    }
	    System.out.println("Linkedlist="+l1.get(0));
	    System.out.println("Vector="+v1.get(0));
	 }
}

