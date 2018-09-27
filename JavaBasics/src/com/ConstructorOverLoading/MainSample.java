package com.ConstructorOverLoading;

public class MainSample 
{ public static void main(String[] args) 
   {
	System.out.println("main method started");
	Sample s1=new Sample();
	Sample s2=new Sample(1);
	Sample s3=new Sample(1.2);
	Sample s4=new Sample(2,2.2);
	Sample s5=new Sample(2.2,4);
	System.out.println("main method ended");
   }

}
