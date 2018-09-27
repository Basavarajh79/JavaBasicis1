package com.ClassTypeCasting;

public class MainDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("mainmethod started");
		//UpCasting
	    Demo1 ref=new Demo2();
	    //DownCasting
	    Demo2 ref1=(Demo2)new Demo1();
    }

}
