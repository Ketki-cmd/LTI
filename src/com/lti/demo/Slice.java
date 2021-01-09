package com.lti.demo;

public class Slice 
{
	public static int solution(int[] A) 
	
	{
		  int len = A.length;
		  System.out.println(len);
		  int max = 0;

		  int[] left = new int[len];
		  for(int i =1;i<len-1;i++)
		  {
		    left[i]=Math.max(left[i-1]+A[i],0);
		    System.out.println(left[i]);
		  }
		  
		  int[] right = new int[len];
		  for(int i=len-2;i>0;i--)
		  {
		    right[i]=Math.max(right[i+1]+A[i],0);
		    System.out.println(right[i]);
		  }

		  
		  for(int i=1;i<len-1;i++)
		  {
		    max=Math.max(max,left[i-1]+right[i+1]);
		  }

		  return max;
		}
	
	public static void main(String args[])
	{
		int A[]= {3,2,6,-1,4,5,-1,2};
		System.out.println(solution(A));
	}
}
