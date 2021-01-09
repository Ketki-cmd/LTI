package com.lti.demo;

import java.util.Scanner;

public class DecimalConv {

	public static int calstep(int num)
	{
		if(num%2==0)
		{
			num=num-num/2;
			
		}
		else
		{
			num= num-((num/2)+1);
		}
		return num;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary no.");
	    String s=sc.next();
	    System.out.println("Binary Representation:"+s);
	    int num=Integer.parseInt(s,2);
	    System.out.println("Decimal Representation:"+num);
	    System.out.println("Steps Required:"+calstep(num));
	    
		
	}
}
