package com.lti.demo;

public class CyclicArray 
{

public static int[] solution(int[] a,int k)
{
	int[] arr=new  int[a.length];
	int s=k%a.length;
	for(int i=0;i<a.length;i++)
	{
		int r=(i+s)%a.length;
		arr[r]=a[i];
	}
	
	return arr;
}
	public static void main(String args[])
	{
		int a[]=new int[]{1,2,3,4,5};
		int n=3;
		
		int arr[]=new CyclicArray().solution(a,n); ;
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}

}

