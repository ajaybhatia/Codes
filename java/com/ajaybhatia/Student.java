package com.ajaybhatia;

import java.util.Arrays;

public class Student {
	private long rollNo;
	private String name;
	private String courseName;
	private int[] subjectMarks;

	public Student(long rollNo, String name, String courseName) {
		this.rollNo = rollNo;
		this.name = name;
		this.courseName = courseName;
		this.subjectMarks = new int[5];
	}

	public Student(long rollNo, String name, String courseName, int[] subjectMarks) {
		this.rollNo = rollNo;
		this.name = name;
		this.courseName = courseName;
		this.subjectMarks = new int[5];
		this.subjectMarks = Arrays.copyOf(subjectMarks, 5);
	}

	// Setters/Mutators
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setSubjectMarks(int[] subjectMarks) {
		this.subjectMarks = Arrays.copyOf(subjectMarks, 5);	
	}

	// Getters/Accessors
	public long getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getCourseName() {
		return courseName;
	}

	public int[] getSubjectMarks() {
		return subjectMarks;
	}

	public void showMarks() {
		for (int i = 0; i < subjectMarks.length; i++)
			System.out.print(subjectMarks[i] + " ");

		System.out.println();
	}

	public float getAverageMarks() {
		int total = 0;
		for (int i = 0; i < subjectMarks.length; i++)
			total += subjectMarks[i];

		return (float)(total) / subjectMarks.length;
	}

	@Override
	public String toString() {
		return name + " bearing " + rollNo + " is in " + courseName;
	}
}