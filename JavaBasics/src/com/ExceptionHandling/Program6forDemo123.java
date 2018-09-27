package com.ExceptionHandling;

public class Program6forDemo123 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Demo1 ref=new Demo1();
		try
		{
			ref.test1();	
		}
		catch(ArithmeticException ref1)
		{
			ref1.printStackTrace();
			System.out.println("exception handled in main method");
		}
        System.out.println("main method ended");
	}

}
