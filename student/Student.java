package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name is Deepika M");

	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Department is ECE");

	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student ID is 123");

	}
	
	public static void main(String[] args) {
		
		College obj = new College();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		
		Department obj1 = new Department();
		obj1.deptName();
		
		Student obj2 = new Student();
		obj2.studentDept();
		obj2.studentId();
		obj2.studentName();
		
		
		
	}
}

