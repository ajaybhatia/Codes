/*
 * StudentList.java
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

import java.util.ArrayList;

public class StudentList {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList();
		
		// Added few students (Insertion)
		list.add(new Student(1, "Damanpreet Singh", "BCA"));
		list.add(new Student(2, "Harpreet Singh", "BCA"));
		list.add(new Student(3, "Manish Dhir", "BCA"));
		list.add(new Student(4, "Anchal Sabharwal", "BCA"));
		list.add(new Student(5, "Shikha Gupta", "BCA"));
		list.add(new Student(6, "Manpreet Kaur-I", "BCA"));
		list.add(new Student(7, "Manpreet Kaur-II", "BCA"));
		list.add(new Student(8, "Kiran", "BCA"));
		list.add(new Student(9, "Vandana", "BCA"));
		list.add(new Student(10, "Mamta", "BCA"));
		list.add(new Student(11, "Kajal", "BCA"));
		list.add(new Student(12, "Navdeep", "BCA"));
		list.add(new Student(13, "Renu Paul", "BCA"));
		list.add(new Student(14, "Pardeep", "BCA"));
		list.add(new Student(15, "Jaspreet Kaur-T", "BCA"));
		list.add(new Student(16, "Jaspreet Kaur-S", "BCA"));
		list.add(new Student(17, "Prabhdeep kaur", "BCA"));
		
		System.out.println("STUDENT LIST ");
		System.out.println("============");
		// Iterate over list and print Students
		for (Student student : list)
			System.out.println(student);
			
		//Deletion from list
		list.remove(6);
		list.remove(14);
		
		System.out.println("LIST AFTER DELETION");
		System.out.println("===================");
		// Iterate over list and print Students
		for (Student student : list)
			System.out.println(student);
	}
}

