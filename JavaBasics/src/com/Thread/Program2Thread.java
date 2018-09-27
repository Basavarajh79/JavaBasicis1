package com.Thread;

public class Program2Thread extends Thread
{
	public void run()
	{
		Thread ref=Thread.currentThread();
	System.out.println("id="+ref.getId());
	System.out.println("name="+ref.getName());
	for(int i=0;i>0;i--)
	{
		System.out.println(ref.getName()+"="+i);
	}
	try
	{
		Thread.sleep(1500);
	
}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}}
	

}
