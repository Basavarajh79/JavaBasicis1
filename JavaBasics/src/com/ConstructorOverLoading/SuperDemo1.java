package com.ConstructorOverLoading;

public class SuperDemo1 extends SuperDemo
{
	int a=456;
	public void test()
	{
		System.out.println("a="+super.a);
		System.out.println("a="+a);
		
	}

}
