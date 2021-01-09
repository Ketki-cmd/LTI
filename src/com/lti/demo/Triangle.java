package com.lti.demo;

import java.util.Arrays;

public class Triangle {

	public static int solution(int [] A)
	{
		if(A.length<3)
		{
		return 0;
		}
		Arrays.sort(A);
		for(int i=0;i<A.length-2;i++)
		{
		if((A[i]+A[i+1]>A[i+2])&&(A[i+1]+A[i+2]>A[i])&&(A[i+2]+A[i]>A[i+1]))
		{
			return 1;
		}
		}
		return 0;
	}
	
	public static void main(String args[])
	{
		int A[]= {-5,-3,-1,2,3,5};
		System.out.println(solution(A));
	}
}
