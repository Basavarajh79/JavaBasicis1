package com.ExceptionHandling;

public class Program4 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		try
		{
			int a=1/0;
		}
		catch(ArithmeticException ref)
		{
			System.out.println("entering catch block");
		}
		finally
		{
			System.out.println("entering the finally block");
		}
		try
		{
			int a=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside the finally catch block");
		}
		System.out.println("main method ended");
		
	}

}
