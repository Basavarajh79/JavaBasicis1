package com.StaticmemberoutsidetheClass;

public class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		StaticmemberoutsidetheClass.test();
		System.out.println("a="+StaticmemberoutsidetheClass.a);
		System.out.println("main method ended");
	}

}
