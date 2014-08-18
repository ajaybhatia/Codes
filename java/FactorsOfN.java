/*
 * FactorsOfN.java
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

import java.util.Scanner;

public class FactorsOfN {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = scan.nextInt();
		
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				n /= i;
				System.out.print(i + " ");
				i = 2;
			} else
				i++;
		}
		
		System.out.println();
	}
}

