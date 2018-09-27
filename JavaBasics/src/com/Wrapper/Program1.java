package com.Wrapper;

public class Program1 
{
	public static void main(String[] args) 
	{
		Integer a=new Integer(25);
		System.out.println(a);
		System.out.println(a.hashCode());
		Integer b=new Integer("25");
		System.out.println(b);
		System.out.println(b.hashCode());
		int c=45;
		Integer d=new Integer(c);
		System.out.println(d);
		System.out.println(d.hashCode());
		Integer e=34;
		System.out.println(e);
		System.out.println(e.hashCode());
		Double ref=3.9;
		System.out.println(ref);
		System.out.println(ref.hashCode());
	}

}
