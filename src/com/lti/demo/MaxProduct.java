package com.lti.demo;

public class MaxProduct 
{
	public static int solution(int [] A)
	{
		int len=A.length;
		if (len < 3)
		{
        return -1;
		}
        int max = Integer.MIN_VALUE;
  
        for (int i=0;i<len-2;i++)
        {
        	for (int j=i+1;j<len-1;j++)
        	{
        		for(int k=j+1;k<len;k++)
        		{
                max = Math.max(max,
                          A[i] * A[j] * A[k]);
        		}
        	}
        }
  
    return max;
}
	 public static void main (String [] args)
	    {
	        int [] A = { 10, 3, 5, 6, 20 };
	 
	            System.out.println("Max product: " +solution(A));
	    }
}
