package com.lti.demo;

public class CountSteps 
{

	public static int solution(int n)
	{
		if(!(n>=1 && n<=45))
		{
			return 0;
		}	
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		
		return solution(n-1)+solution(n-2);
		
	}
	
	public static void main(String args[])
	{
		int n=3;
		System.out.println("Total no. of ways to climb stairs:"+solution(n));
	}
	
}
