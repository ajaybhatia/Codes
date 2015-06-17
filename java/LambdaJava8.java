/*
 * LambdaJava8.java
 * 
 * Copyright 2015 Ajay Bhatia <ajay@dumb-box>
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

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class LambdaJava8 {
	private static void sort(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
	
	public static void main (String args[]) {
		List<String> names = new ArrayList<String>();
		
		names.add("Gaurav");
		names.add("Mahesh");
		names.add("Ajay");
		names.add("Rohit");
		names.add("Barinder");
		names.add("Piyush");
		names.add("Rajinder");
		names.add("Harsh");
		
		System.out.println("Before sorting: " + names);
		
		sort(names);
		
		System.out.println("After sorting: " + names);
	}
}

