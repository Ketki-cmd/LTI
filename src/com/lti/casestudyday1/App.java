package com.lti.casestudyday1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public void Scenario1()
	 {
		Student s1=new Student(1,"Aditi","12-10-2000");
		 Student s2=new Student(2,"Aryan","01-02-1999");
		 Student s3=new Student(3,"Snehal","18-11-2001");
		 Student s4=new Student(4,"Neha","21-05-1998");
		 new Info().display(s1);
		 new Info().display(s2);
		 new Info().display(s3);
		 new Info().display(s4);
		 Course c1=new Course(101,"c","60 min",5000);
		 Course c2=new Course(102,"java","90 min",10000);
		 new Info().display(c1);
		 new Info().display(c2);
		 
		 
	 }
	public void Scenario2()
	{
		Info in=new Info();
		List<Student> li=new ArrayList<Student>();
		li.add(new Student(1,"Aditi","12-10-2000"));
		li.add(new Student(2,"Aryan","01-02-1999"));
		li.add(new Student(3,"Snehal","18-11-2001"));
		li.add(new Student(4,"Neha","21-05-1998"));
		for(int i=0;i<li.size();i++)
		{
			in.display(li.get(i));
		}
		
	}
	public void Scenario3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of entries:");
		int num=sc.nextInt();
		Student[] Student=new Student[num];
		for(int i=0;i<num;i++)
		{
			Student[] Stu=new Student[i];
			System.out.println("Enter id:");
			int id=sc.nextInt();
			Stu[i].setId(id);
			System.out.println("Enter name:");
			String name=sc.next();
			Stu[i].setName(name);
			System.out.println("Enter dob:");
			String dob=sc.next();
			Stu[i].setDateofbirth(dob);
			}
	}
	
	 public static void main(String args[])
	 {
		 
		
		 App a=new App();
		// a.Scenario1();
		 a.Scenario2();
		// a.Scenario3();
	 }
}
