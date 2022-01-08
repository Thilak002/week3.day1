package org.student;

import org.department.Department;

public class Student extends Department {
    public void studentName() {
		System.out.println("Raj Thilak");

    }
    public void studentDept() {
        System.out.println("CSE");

	}
    public void studentId() {
		System.out.println("15");

	}
	public static void main(String[] args) {
		Student sd = new Student();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
		sd.departmentName();
		sd.studentName();
		sd.studentDept();
		sd.studentId();

	}

}
