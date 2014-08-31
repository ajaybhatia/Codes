/*
 * Binomial.java
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


public class Binomial {
	static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
			
		return fact;
	}
	
	static int combin(int n, int r) {
		return fact(n) / (fact(r) * fact(n - r));
	}
	
	static int power(int x, int y) {
		int ans = 1;
		for (int i = 1; i <= y; i++)
			ans *= x;
			
		return ans;
	}
	
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);
		
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum += combin(n, i) * power(a, i) * power(b, n - i);
			
		System.out.println(sum);
	}
}

