package com.ConstructorOverLoading;

public class Sample1 
{
	Sample1()
	{
		System.out.println("zero arg constructor");
	}
	Sample1(int a)
	{
		this();
		System.out.println("int arg constructor");
	}
	Sample1(double b)
	{
		this(100);
		System.out.println("double arg constructor");
	}

}
