package com.Thread;

public class ThreadC implements Runnable
{
	public void run()
	{
		System.out.println("inside the Runnable Object");
		for(int i=0;i<5;i++)
		{
			System.out.println("i="+i);
		}
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	

}
