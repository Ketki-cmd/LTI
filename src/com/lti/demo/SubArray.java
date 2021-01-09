package com.lti.demo;


public class SubArray 
{
	public static boolean solution(int A[]) 
    {  
		for (int i=0;i<A.length;i++)
        {
            int sum=0;
 
    
            for (int j=i;j<A.length;j++)
            {
                
                sum=sum+A[j];
                if (sum == 0) 
                {
                   return true;
                }
            }
        }
		return false;
    }
		
		
  
    public static void Main(String args[]) 
    { 
        int a[]= {4,2,0,1,6}; 
       System.out.println(solution(a));
    } 
} 

