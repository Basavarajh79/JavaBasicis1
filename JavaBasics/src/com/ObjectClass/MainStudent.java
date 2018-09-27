package com.ObjectClass;

public class MainStudent 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(12,"ABC");
		Student s2=new Student(12,"ABC");
		System.out.println("hashcode="+s1.hashCode());
		System.out.println("hashcode="+s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
