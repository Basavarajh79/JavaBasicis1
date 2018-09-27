package com.CollectionStringClass;

public class Program3CommondLineOrg 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		String []ar= {"java","sql","test"};
		for (int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		{
			System.out.println("size="+args.length);
			for(int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		}
		System.out.println("main method ended");
	}

}
