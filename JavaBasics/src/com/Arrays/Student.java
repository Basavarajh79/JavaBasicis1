package com.Arrays;

public class Student 
{
	int id;
	String name;
	double marks;
	public Student(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
	   return this.id+" "+this.name+" "+this.marks;
	}

}
