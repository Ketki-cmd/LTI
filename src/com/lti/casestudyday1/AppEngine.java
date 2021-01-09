package com.lti.casestudyday1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
public class AppEngine 
{
	
	public void introduce(Course course) throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","sys as sysdba","oracle");
	        PreparedStatement preparedStatement = con.prepareStatement("Insert into course values (?,?,?,?)");
	        preparedStatement.setInt(1,course.getId());
	        preparedStatement.setString(2, course.getName());
	        preparedStatement.setInt(3, course.getFees());
	        preparedStatement.setInt(4,course.getDuration());
	        preparedStatement.executeUpdate();	
	}
	
	public void register(Student student) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","sys as sysdba","oracle");
        PreparedStatement preparedStatement = con.prepareStatement("Insert into student values (?,?,?)");
        preparedStatement.setInt(1, student.getId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setDate(3,(Date) student.getDateofbirth());
        preparedStatement.executeUpdate();
	}
	
	public Student[] listOfStudent() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","sys as sysdba","oracle");
    Statement stmnt = con.createStatement();
    ResultSet rs = stmnt.executeQuery("SELECT * from student");
    List<Student> studentList = new ArrayList<Student>();

    while (rs.next()){
        studentList.add(new Student(rs.getInt(1),rs.getString(2),rs.getDate(3)));
    }
    int numOfStudents=0;
    numOfStudents=studentList.size();
    Student[] students = new Student[numOfStudents];
    for(int i=0;i<numOfStudents;i++){
        students[i]=new Student(studentList.get(i).getId(),studentList.get(i).getName(),studentList.get(i).getDateofbirth());
    }
    return students;
	
	}
	
	public Course[] listOfCourses() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","sys as sysdba","oracle");
        Statement stmnt = con.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * from course");
        List<Course> courseList = new ArrayList<Course>();

        while (rs.next()){
            courseList.add(new Course(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
        }
        int numOfCourses=0;
        numOfCourses=courseList.size();
        Course[] courses = new Course[numOfCourses];
        for(int i=0;i<numOfCourses;i++){
            courses[i]=new Course(courseList.get(i).getId(),courseList.get(i).getName(),courseList.get(i).getFees(),courseList.get(i).getDuration());
        }
        return courses;
	}
	
	public void enroll(Student student,Course course) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","sys as sysdba","oracle");
        PreparedStatement preparedStatement = con.prepareStatement("Insert into enroll values (?,?,CURDATE())");
        preparedStatement.setInt(1, student.getId());
        preparedStatement.setInt(2, course.getId());
        preparedStatement.executeUpdate();
	}
	
	public Enroll[] listOfEnrollments() throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","sys as sysdba","oracle");
	        Statement stmnt = con.createStatement();
	        ResultSet rs = stmnt.executeQuery("SELECT * from enroll");
	        List<Enroll>  enrollList= new ArrayList<Enroll>();

	        while (rs.next()){
	            int studentId = rs.getInt(1);
	            int courseId = rs.getInt(2);
	            java.util.Date date = rs.getDate(3);
	            Student tempStudent;
	            Course tempCourse;
	            PreparedStatement preparedStatement = con.prepareStatement("SELECT * from student WHERE id=?");
	            preparedStatement.setInt(1,studentId);
	            ResultSet rs2 = preparedStatement.executeQuery();
	            tempStudent = new Student(rs2.getInt(1),rs2.getString(2),rs2.getDate(3));

	            PreparedStatement preparedStatement1 = con.prepareStatement("SELECT * from course WHERE courseid=?");
	            preparedStatement1.setInt(1,courseId);
	            ResultSet rs3 = preparedStatement1.executeQuery();
	            tempCourse = new Course(rs3.getInt(1),rs3.getString(2),rs3.getInt(3),rs3.getInt(4));
	            enrollList.add(new Enroll(tempStudent,tempCourse,date));
	        }
	        int numOfEnrolls=0;
	        numOfEnrolls=enrollList.size();
	        Enroll[] enrolls = new Enroll[numOfEnrolls];
	        for(int i=0;i<numOfEnrolls;i++){
	            enrolls[i]=new Enroll(enrollList.get(i).getStudent(),enrollList.get(i).getCourse(),enrollList.get(i).getEnrollmentDate());
	        }
	        return enrolls;
	}
	
	
	}
	
