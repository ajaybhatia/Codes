/*
 * Series12.java
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

/*
 * 1 3 5 7 9  11 13 15 17 19
 * 2 4 6 8 10 12 14 16 18 20
 * 21 23 25 27 29 31 33 35 37 39
 * 22 24 26 28 30 32 34 36 38 40
 *  
 */

public class Series12 {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		
		int[][] a = new int[n][10];
		
		int oddNum = 1, evenNum = 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				if (i % 2 == 0 && oddNum % 2 != 0) {
					a[i][j] = oddNum;
					oddNum += 2;
				} else {
					a[i][j] = evenNum;
					evenNum += 2;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) 
				System.out.print(a[i][j] + " ");
				
			System.out.println();
		}
	}
}
