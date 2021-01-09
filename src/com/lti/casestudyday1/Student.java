package com.lti.casestudyday1;

import java.sql.Date;

public class Student
{
	int id;
	String name;
	Date dateofbirth;
	Student(int id,String name,Date d)
	{
		this.id=id;
		this.name=name;
		this.dateofbirth=d;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
}
