package com.Thread;

public class MainThreadC
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		ThreadC t1=new ThreadC();
		Thread ref=new Thread(t1);
		ref.start();
		System.out.println("main method ended");
	}

}
