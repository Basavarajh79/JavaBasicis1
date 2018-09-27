package com.ConstructorOverLoading;

public class Sample 
{
	Sample()
	{
		System.out.println("zero arg constructor");
	}
	Sample(int a)
	{
		System.out.println("int arg constructor");
	}
	Sample(double b)
	{
		System.out.println("double arg constructor");
	}
	Sample(int a,double b)
	{
		System.out.println("int and double arg constructor");
	}
	Sample(double b,int a)
	{
		System.out.println("double and int arg constructor");
	}

}
