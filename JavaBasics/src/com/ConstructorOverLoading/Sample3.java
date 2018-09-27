package com.ConstructorOverLoading;

public class Sample3 extends Sample2
{
   int c;
   int d;
   Sample3()
   {
	   super(45,50);
	   System.out.println("subclass");
	   c=55;
	   d=60;
   }

}
