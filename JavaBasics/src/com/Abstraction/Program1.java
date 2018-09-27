package com.Abstraction;

abstract class Program1 
{
	abstract public void disp();
	static int a=123;
	double b=23.7;
	public static void test()
	{
		System.out.println("Test Method");
	}
	public void start()
	{
		System.out.println("Start Method ");
	}
	Program1(int d)
	{
		System.out.println("abstract class constructor");
	}

}
