package com.lti.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryGap 

{

	
	public static int solution(int num)
	{
		int res = 0;
		String binary=Integer.toBinaryString(num);
		System.out.println("Binary Representation:"+binary);
		List <Integer> list=new ArrayList<Integer>();
		for(int i=0;i<binary.length();i++)
		{
			if(binary.charAt(i)=='0')
				continue;
			list.add(i);
		}
		
		for(int i=0;i<list.size()-1;i++)
		{
			int gap=(int) (list.get(i+1)-list.get(i)-1);
			 res=Math.max(res, gap);
		}
		
		
		return res;
	}
	
	
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		num=sc.nextInt();
		System.out.println("Binary Gap"+solution(num));
		
	}
}
