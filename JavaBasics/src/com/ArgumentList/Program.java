package com.ArgumentList;

public class Program 
{
	public static void test(int a)
	{
		System.out.println("a="+a);
		System.out.println("executing test method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		test(123);
		test(456);
		test(789);
		System.out.println("main method ended");
	}

}
