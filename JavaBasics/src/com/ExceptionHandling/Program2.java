package com.ExceptionHandling;

public class Program2 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("entering try block");
			String s1="java";
			s1.charAt(8);
			System.out.println(s1);
			System.out.println("exiting try block");
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("entering catch block");
			System.out.println("exception handled");
			System.out.println("exiting catch block");
		}
		System.out.println("main method ended");
		
	}

}
