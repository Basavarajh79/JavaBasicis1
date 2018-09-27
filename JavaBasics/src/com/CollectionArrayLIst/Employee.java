package com.CollectionArrayLIst;

public class Employee 
{
	String name;
	int id;
	Employee(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return this.name+" "+this.id;
	}

}
