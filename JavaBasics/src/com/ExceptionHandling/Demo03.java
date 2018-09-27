package com.ExceptionHandling;

import java.io.IOException;

public class Demo03 
{
	public void test3() throws IOException
	{
		System.out.println("test3 method");
		throw new IOException();
	}

}
