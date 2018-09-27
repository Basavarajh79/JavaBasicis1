package com.AccessingNonStaticmemberoutsidetheclass;

public class Program2 
{
	static int a=10;
	double b=4.3;
	public void test()
	{
		System.out.println("executing non static method");
	}
	public static void disp()
	{
		System.out.println("executing disp method");
	}

}
