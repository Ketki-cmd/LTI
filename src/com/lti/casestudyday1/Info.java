package com.lti.casestudyday1;

public class Info {

	public void display(Student s)
	{
		System.out.println("Student id:"+s.getId());
		System.out.println("Student name:"+s.getName());
		System.out.println("Student dob:"+s.getDateofbirth());
	}
	
	public void display(Course c)
	{
		System.out.println("Course id:"+c.getId());
		System.out.println("Course name:"+c.getName());
		System.out.println("Course duration:"+c.getDuration());
		System.out.println("Course fees:"+c.getFees());
	}
	
	public void display(Enroll e)
	{
		System.out.println("Student Info"+e.getStudent());
		System.out.println("Course Info"+e.getCourse());
		System.out.println("Enroll Date"+e.getEnrollmentDate());
	}
}
