package com.ObjectClass;

public class Student 
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int hashCode()
	{
		return this.id;
	}
	public boolean equals(Object ob)
	{
		Student st=(Student)ob;
		return this.id==st.id;
	}
	public String toString()
	{
		return this.id+" "+this.name;
	}

}
