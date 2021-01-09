package com.lti.casestudyday1;

public class Course 
{
	int id;
	String name;
	int duration;
	int fees;
	
	public Course(int id,String name,int i,int fees)
	{
		this.id=id;
		this.name=name;
		this.duration=i;
		this.fees=fees;
		
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
}
