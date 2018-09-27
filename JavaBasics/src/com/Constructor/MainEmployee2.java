package com.Constructor;

public class MainEmployee2 
{ 
	public static void main(String[] args) 
	{
		System.out.println("main method started");
        Employee2 e1=new Employee2(12,"abc",1234565.7);
        System.out.println("empId="+e1.empId);
    	System.out.println("name="+e1.name);
    	System.out.println("sal="+e1.sal);
    	Employee2 e2=new Employee2(14,"def",7894561.2);
        System.out.println("empId="+e2.empId);
    	System.out.println("name="+e2.name);
    	System.out.println("sal="+e2.sal);
        System.out.println("main method ended");
		
    }

}
