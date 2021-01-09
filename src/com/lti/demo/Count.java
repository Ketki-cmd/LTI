package com.lti.demo;

public class Count
{

	public static int countcur(int target)
	{
		int avail[]=new int[] {500,200,100,50,20,10};
		int c[]=new int[6];
		
		for(int i=0;i<c.length;i++)
		{
			if(target>=avail[i])
			{
				c[i]=target/avail[i];
				target=target-c[i]*avail[i];
				
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=0)
			{
				System.out.println(avail[i]+" "+c[i]);
			}
			
		}
		
		return 0;
		
	}
	
	public static void main(String args[])
	{
		int amount=1010;
		countcur(amount);
	}
}
