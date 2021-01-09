package com.lti.casestudyday1;
import java.time.*;
import java.util.Date;;


public class Enroll {
	private Student student;
    private Course course;
    private Date enrollmentDate;
    Enroll(Student student,Course course,Date date)
    {
    	this.student=student;
    	this.course=course;
    	this.enrollmentDate=date;
    }
	public Enroll(Student student2, Course course2, LocalDate enrollmentDate2) {
		// TODO Auto-generated constructor stub
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
    
}
