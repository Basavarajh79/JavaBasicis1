package com.Thread;

public class ThreadB extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("i="+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
	}

}
