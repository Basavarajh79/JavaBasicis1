package com.Thread;

public class ThreadProgram2 extends Thread
{
	public void run()
	{
		Thread ref=Thread.currentThread();
		System.out.println("id1="+ref.getId());
		System.out.println("name1="+ref.getName());
		for(int i=0;i<5;i++)
		{
			System.out.println("i="+i);
		}
	}

}
