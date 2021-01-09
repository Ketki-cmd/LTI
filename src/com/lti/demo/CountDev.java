package com.lti.demo;

public class CountDev 
{
	public static int solution(int A,int B,int K)
	{
		int counter = 0;
		if(K > B) {
		      if(A == 0 || B == 0)
		      {
		        return 1; 
		        }
		      return 0; 
		      }
		if(A == 0) {
		      counter++;  
		    }
		if(B<A || K<=0 )
		{
			return 0;
		}
		for(int i=A;i<=B;i++)
		{
			if((i%K)==0)
			{
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String args[])
	{
		System.out.println(solution(100,123,2));
	}
}
