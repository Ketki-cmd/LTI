package com.lti.demo;
import java.io.*;  
import java.util.Scanner; 
public class democsv 
{
 
	public static void main(String[] args) throws Exception  
	{  
	Scanner sc = new Scanner(new File("C:\\Users\\Ketki\\Desktop\\complaints.csv"));  
	sc.useDelimiter(",");   //sets the delimiter pattern  
	while (sc.hasNext())  //returns a boolean value  
	{  
	System.out.print(sc.next());  //find and returns the next complete token from this scanner  
	}   
	sc.close();  //closes the scanner  
	}  
}  

