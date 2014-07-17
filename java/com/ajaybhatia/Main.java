package com.ajaybhatia;

import com.ajaybhatia.Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student(10101010L, "Ajay Bhatia", "PhD");
		student.setSubjectMarks(new int[]{78, 83, 79, 84, 91});

		System.out.println(student.getAverageMarks());
	}
}