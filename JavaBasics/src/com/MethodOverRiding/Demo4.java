package com.MethodOverRiding;

public class Demo4 
{
	public static void main(String[] args) 
	{
		//narrowing 
		int a=(int)7.5;
		System.out.println(a);
		//widening
		double b=7;
		System.out.println(b);
		char ch='D';
		System.out.println(ch);
	    char ch1=(char) (ch+32);
	    System.out.println(ch1);
	    byte b1=1;
	    long b2=1;
	    int res=(int)(b1+b2);
	    System.out.println(res);
	    byte b3=127;
	    byte res1=(byte)(b3+1);
	    System.out.println("res="+res1);
	    //for(byte b5=0;;++b5)
	    {
	    	//if(b5<3)
	    	{
	    		//System.out.println("b5="+b5);
	    	}
	    }
    }

}
