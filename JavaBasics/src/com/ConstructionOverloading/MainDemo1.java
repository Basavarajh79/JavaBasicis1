package com.ConstructionOverloading;

public class MainDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
	    Demo1 d=new Demo1();
	    Demo1.test();
	    d.test(1);
	    System.out.println("main method ended");
    }

}
