package com.lti.demo;

class Employee
{

		private int empno;
		private String ename;
		Employee(int empno,String ename) {
			this.empno=empno;
			this.ename=ename;	
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		
}
	public class Emp {
		public static void main(String[] args) {
			Employee e[];
			e=new Employee[3];
			e[0]=new Employee(101, "Arun");
			e[1]=new Employee(102, "Tarun");
			e[2]=new Employee(103, "Varun");
			
			for(int i=0;i<e.length;i++) {
				System.out.println("Empno:"+e[i].getEmpno());
				System.out.println("Emp name:"+e[i].getEname());
			}
		}
}
