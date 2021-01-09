package com.lti.demo;

public class MaxCounter 
{
	public static int[] solution(int N,int[] A)
	{
		int [] counter=new int[N];
		int value=0,max=0;
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]<=N)
				{
					if(value>counter[A[i]-1])
					{
					counter[A[i]-1]=value;
					}
					else
					{
					counter[A[i]-1]++;
					}
				
					if(counter[A[i]-1]>max)
					{
						max=counter[A[i]-1];
					}
				}
			else
			{
				value=max;
			}
		}
			for(int i=0;i<N;i++)
			{
				if(counter[i]<value)
				{
					counter[i]=value;
				}
			}
		return counter;
		
	}
		public static void main(String args[])
		{
			int arr[]=new int[] {1,2,3,3,1,3,1};
			int x=5;
			System.out.println(solution(x,arr));
		}
		
		
	}
