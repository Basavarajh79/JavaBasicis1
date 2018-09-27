package com.ClassTypeCasting;

public class MainSample 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Sample1 s1=new Sample2();
		System.out.println("a="+s1.a);
	    s1.test();
	    System.out.println("main method ended");
	}

}
