package com.Student;

public class MainStudent 
{ public static void main(String[] args) 
  {
	System.out.println("main method started");
	Stationary st1=new Stationary();
	Notebook ref1=st1.getbook();
	Pen ref2=st1.getpen();
	Student s1=new Student();
	s1.Papernote(ref1,ref2);
	System.out.println("main method ended");
  }

}
