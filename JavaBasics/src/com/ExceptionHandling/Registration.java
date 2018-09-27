package com.ExceptionHandling;

public class Registration 
{
	public void Register(String name,int age) throws AgeInvalidException
	{
		if (age>=18)
		{
		    System.out.println("proceed for registration....");
			System.out.println("registration successful.....");
		}
		else
		{
			throw new AgeInvalidException();
		}
	}

}
