
package com.lti.demo;

public class ArrDemo {
	
	
	public static int sum(int num)
	{
		int min=0,max=0,c1=0,c2=0,sum=0;
		while(num!=0)
		{
			int r=num%10;
			max=Math.max(r, max);
			if(num%10==max)
			{
				c1++;
			}
			else 
			{
				c1=1;
			}
			num=num/10;

		}
		while(num!=0) 
		{
			int r=num%10;
			min=Math.min(r, min);
			if(num%10==min)
			{
				c1++;
			}
			else
			{
				c2=1;
			}
			
			num=num/10;
		}
		System.out.println("min"+min);
		System.out.println("max"+max);
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);
		
	sum=max*c1+min*c2;
	return sum;
	}
	
	public static void main(String args[])
	{
		int arr[]=new int[]{11,34,56,91,81};
		StringBuilder s=new StringBuilder();
		for(int i:arr)
		{
			s.append(i);
		}
		int num=Integer.parseInt(s.toString());
		System.out.println(num);
		System.out.println("sum"+sum(num));
	}
}
