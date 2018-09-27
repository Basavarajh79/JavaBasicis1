package com.ExceptionHandling;

public class Program5 
{
	public static void display() throws InterruptedException
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args) 
	{
		try
		{
		display();
		}
		catch(InterruptedException ref)
		{
			System.out.println("handled in main method");
		}
		System.out.println("handled in main method");

}
}
