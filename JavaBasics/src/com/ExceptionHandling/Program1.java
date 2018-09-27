package com.ExceptionHandling;

public class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		try
		{
			int a=1/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("exception handled");
		}
		System.out.println("main method ended");

	}

}
