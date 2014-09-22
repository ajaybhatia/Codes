/*
 * Student.java
 * 
 * Copyright 2014 Ajay Bhatia <ajay@dumb-box>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

package ajay.core;

public class Student {
	private long rollNo;
	private String name;
	private String courseName;
	
	public Student(long rollNo, String name, String courseName) {
		this.rollNo = rollNo;
		this.name = name;
		this.courseName = courseName;
	}
	
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public long getRollNo() {
		return rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCourseName() {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	@Override
	public String toString() {
		return rollNo + ", " + name + ", " + courseName;
	}
}
