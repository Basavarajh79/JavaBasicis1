package com.ClassTypeDownCosting1;

public class MainOverridenSample 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		OverridenSample s1=new OverridenSample1();
		s1.test();
		//OverridenSample1 s2=(OverridenSample1)s1;
		//s2.test();
	}

}
