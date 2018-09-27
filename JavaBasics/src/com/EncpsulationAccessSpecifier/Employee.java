package com.EncpsulationAccessSpecifier;

public class Employee 
{
	private int id;
	private String name;
	private double sal;
	Employee(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public int getid()
	{
		return this.id;
	}
	public String getname()
	{
		return this.name;
	}
	public double getsal()
	{ 
		return this.sal;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setsal(double sal)
	{
		this.sal=sal;
	}

}
