package com.FlowControl;

public class IfElse1
{
	public static void main(String[] args) 
	{
		System.out.println("main method ended");
		int a=115;
		int b=55;
		int c=20;
		if(a>b&&a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else if(b>c)
		{
			System.out.println("b is greater than c");
		}
		else 
		{
			System.out.println("c is greater");
		}
	
   }
	

}
