package com.ExceptionHandling;

public class MainRegisteration 
{
	public static void main(String[] args)
	{
		Registration ref=new Registration();
		try
		{
		ref.Register("ABC",18);
	    }
		catch(AgeInvalidException e)
		{
			e.printStackTrace();
		}

}
}