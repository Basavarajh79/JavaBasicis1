
package com.ArgumentList;

public class Login 
{
	public static boolean validate(String name,int password)
	{
		if (name=="ABC"&&password==123)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		boolean res=validate("ABC",123);
		if(res)
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login unsuccessful");
		}
	}

}
