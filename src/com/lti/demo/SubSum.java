package com.lti.demo;

public class SubSum 
{

	public static boolean solution (int A[])
	{
		for(int i=0;i<A.length;i++)
		{
			int sum=0;
			
			for(int j=i;j<A.length;j++)
			{
				sum+=A[j];
				if (sum==0)
				{
					return true;
				}
				
			}
		}
		return false;
		
	}
	public static void main(String arg[])
	{
		int A[]= {4,2,-3,1,6};
		 System.out.println(solution(A));
		
	}
}
