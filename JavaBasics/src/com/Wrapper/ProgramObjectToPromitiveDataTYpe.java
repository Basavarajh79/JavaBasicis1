package com.Wrapper;

public class ProgramObjectToPromitiveDataTYpe 
{
	public static void main(String[] args) 
	{
		Integer ref=new Integer(56);
		System.out.println(ref);
		System.out.println(ref.hashCode());
		//Unboxing/
		int a=ref;
		System.out.println(a);
		//System.out.println(a.hashCode());
		//Error-Cannot invoke hashCode() on the primitive type int
		
	}

}
