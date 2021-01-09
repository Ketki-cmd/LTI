package com.lti.demo;

import java.util.Scanner;

public class Sum 
{
	public static int findsum(int n)
	{
		int sum = 0,n1;
		while(n/10!=0)
		{
			sum=0;
			while(n!=0)
			{
		
				n1=n%10;
				sum=sum+n1;
				n=n/10;
			}
			n=sum;
		}
	
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		System.out.println("Sum:"+findsum(n));
	}
	
}
