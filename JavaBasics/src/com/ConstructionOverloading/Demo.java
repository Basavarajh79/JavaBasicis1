package com.ConstructionOverloading;

public class Demo 
{
	public void start()
	{
		System.out.println("zero arg method");
	}
	public void start(int a)
	{
		System.out.println("int arg method");
	}
	public void start(double b)
	{
		System.out.println("double arg method");
	}
	public void start(int a,double b)
	{
		System.out.println("int and double arg method");
	}
	public void start(double b,int a)
	{
		System.out.println("double and int arg method");
	}

}
