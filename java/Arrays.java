/*
 * Arrays.java
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

public class Arrays {
	public static void main (String args[]) {
		int a[] = new int[100];
		
		for (int i = 0; i < a.length; i++)
			a[i] = (int)(Math.random() * 100);
		
		int evenCount = 0, oddCount = 0;	
		for (int item : a) {
			if (item % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}
			
		System.out.println("Evens = " + evenCount + ", Odds = " + oddCount);	
	}
}

