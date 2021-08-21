package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	
	public void studentName() {
		System.out.println("Student Name");
	}

	public void studentDept() {
		System.out.println("Student Department");
	}
	
	public void studentId() {
		System.out.println("Student Id");
	}

	public static void main(String[] args) {
		
		College colObj =new College();
		colObj.collegeCode();
		colObj.collegeName();
		colObj.collegeRank();
		Department depObj = new Department();
		depObj.deptName();
		Student stdObj = new Student();
		stdObj.studentId();
		stdObj.studentName();
		stdObj.studentDept();
		

	}

}
