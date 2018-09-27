package com.CollectionSet;

public class Student implements Comparable
{
	int id;
	String name;
	public Student(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + "]";
	}
    public int compareTo(Object ob)
    {
    	Student s=(Student)ob;
    	System.out.println(this.name+"_"+s.name);
    	String st1=this.name;
    	String st2=s.name;
    	return -1*st1.compareTo(st2);
    }
	

}
