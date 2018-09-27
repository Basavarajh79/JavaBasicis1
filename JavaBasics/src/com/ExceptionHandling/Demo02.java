package com.ExceptionHandling;

import java.io.IOException;

public class Demo02 
{
	public void test2() throws IOException
	{
		Demo03 ref=new Demo03();
		ref.test3();
		System.out.println("test2 method");
	}

}
