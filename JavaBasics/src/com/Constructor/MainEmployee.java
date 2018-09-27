package com.Constructor;

public class MainEmployee
{ 
	public static void main(String[] args) 
	{
		System.out.println("main method started");
	    Employee e=new Employee();
	    System.out.println("id="+e.EmpId);
	    System.out.println("name="+e.name);
	    System.out.println("sal="+e.sal);
	    Employee e1=new Employee();
	    System.out.println("id="+e1.EmpId);
	    System.out.println("name="+e1.name);
	    System.out.println("sal="+e1.sal);
	    Employee e2=new Employee();
	    System.out.println("id="+e2.EmpId);
	    System.out.println("main method ended");
    }

}
