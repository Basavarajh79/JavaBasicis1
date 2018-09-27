package com.Thread;

public class MainForProgram2ThreadC 
{
   public static void main(String[] args) 
   {
	   System.out.println("main method started");
	   ThreadProgram2 t1=new ThreadProgram2();
	   t1.start();
	   Program2Thread t2=new Program2Thread();
	   t2.start();
	   System.out.println();
}

}
