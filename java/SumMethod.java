/*
 * SumMethod.java
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


public class SumMethod {
	static void print(Object obj) {
		System.out.println(obj);
	}
	
	static double sum(double...obj) {
		double sum = 0;
		for (double val : obj)
			sum += val;
			
		return sum;
	}
	
	public static void main(String args[]) {
		print(sum(1, 2, 3, 4, 8, 78.34, 0.342));
		print(sum(1, 2, 3));
		print(sum(1, 2, 3, 4, 8, 87, 12, 34));
	}
}

