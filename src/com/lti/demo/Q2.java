package com.lti.demo;

public class Q2 {

	static char[] moveVowels(String input)
	{
		char arr[]=input.toCharArray();
		String vow = null;
		String con = null;
	//	
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]=='a')||(arr[i]=='e')||(arr[i]=='i')||(arr[i]=='o')||(arr[i]=='u'))
			{
				vow=String.valueOf(arr[i]);
			}
			else
			{
				con=String.valueOf(arr[i]);
			}
		}
		//String res1=vow+con;
		char vow1[]= vow.toCharArray();
		char con1[]= con.toCharArray();
	    StringBuilder s=new StringBuilder();
			s.append(vow1);
		s.append(con1);
		char result[]=s.toString().toCharArray();
		return result;
	}
	
	
	public static void main(String args[])
	{
		String input="cosmopolitan";
		char []res=Q2.moveVowels(input);
		for(char c:res)
		{
			System.out.println(c);
		}
	}
}
