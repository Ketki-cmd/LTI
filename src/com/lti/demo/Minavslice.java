package com.lti.demo;

public class Minavslice
{
public static int solution(int A[])
{
	int avg=Integer.MAX_VALUE;
	int avg1=0,avg2=0,index=-1;
	for(int i=0;i<A.length-2;i++)
	{
		avg1=(A[i]+A[i+1])/2;
		avg2=(A[i]+A[i+1]+A[i+2])/3;
		
		int avg3=Math.min(avg1,avg2);
		if(avg3<avg)
		{
			avg=avg3;
			
			index=i;
		}
	}
	
	return index;
	}

public static void main(String args[])
{
	int A[]= {4,2,2,5,1,5,8};
	System.out.println(solution(A));
	}
}
