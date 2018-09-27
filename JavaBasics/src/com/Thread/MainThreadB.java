package com.Thread;

public class MainThreadB 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		ThreadB t1=new ThreadB();
	    t1.start();
		ThreadB t2=new ThreadB();
	    t2.start();
        System.out.println("main method ended");     
	}

}
