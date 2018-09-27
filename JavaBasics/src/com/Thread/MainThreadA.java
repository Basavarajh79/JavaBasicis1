package com.Thread;

public class MainThreadA 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		ThreadA t1=new ThreadA();
		t1.start();
		ThreadA t2=new ThreadA();
		t2.start();
		System.out.println("main method ended");
	}

}
