package com.lti.demo;
public class SumZero
{
	public static int solution(int A[]) 
    {  
		for (int i=0;i<A.length;i++)
        {
            int sum=0;
 
    
            for (int j=i;j<A.length;j++)
            {
                
                sum=sum+A[j];
                if (sum == 0) 
                {
                   return 1;
                }
            }
        }
		return 0;
    }
		
		
  
    public static void Main(String args[]) 
    { 
        int a[]= {4,2,0,1,6}; 
       System.out.println(solution(a));
    } 
}
