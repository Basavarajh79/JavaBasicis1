package com.Constructor;

public class MainEmployee1 
{ public static void main(String[] args) 
   {
	System.out.println("main method started");
	Employee1 e=new Employee1(12,"AB",123465.22);
	System.out.println("empId="+e.empId);
	System.out.println("name="+e.name);
	System.out.println("sal="+e.salary);
	Employee1 e2=new Employee1(12,"AB",123465.22);
	System.out.println("empId="+e2.empId);
	System.out.println("name="+e2.name);
	System.out.println("sal="+e2.salary);
	System.out.println("main method ended");
	
   }

}
