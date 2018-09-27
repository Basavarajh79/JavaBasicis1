package com.Arrays;

public class MainStudent 
{
	public static void main(String[] args) 
	{
		Student[] ar=new Student[3];
		ar[0]=new Student(123,"ABC",65.7);
		ar[1]=new Student(45,"CD",72.7);
		ar[2]=new Student(46,"EF",69.6);
		for(Student st:ar)
		{
			System.out.println(st);
		}
	}

}
