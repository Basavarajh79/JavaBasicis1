package com.MethodOverRiding;

public class Program 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
	    Demo1 d=new Demo1();
	    d.test();
	    d.test(1);
	    System.out.println("main method ended");
    }

}
