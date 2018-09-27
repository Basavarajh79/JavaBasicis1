package com.EncpsulationAccessSpecifier;

public class MainEmployee 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(123,"ABC",1234.5);
		System.out.println(e1.getid());
		System.out.println(e1.getname());
		System.out.println(e1.getsal());
		e1.setid(456);
		e1.setname("DEF");
		e1.setsal(4567.8);
		System.out.println(e1.getid());
		System.out.println(e1.getname());
		System.out.println(e1.getsal());
	}

}
