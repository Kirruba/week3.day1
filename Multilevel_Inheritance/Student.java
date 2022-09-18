package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name:Kirruba");
	}

	public void studentDept() {
		System.out.println("Student Dept:CSE");
	}

	public void studentId() {
		System.out.println("Student Id:201301090");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentId();
		s.studentName();
		s.studentDept();

	}
}
