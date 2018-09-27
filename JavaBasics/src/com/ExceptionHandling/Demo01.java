package com.ExceptionHandling;
import java.io.IOException;

public class Demo01 
{
	public void test1() throws IOException
	{
		Demo02 ref=new Demo02();
		ref.test2();
		System.out.println("test1 method");
	}

}
