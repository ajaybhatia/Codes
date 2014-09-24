/*
 * DivideByZero.java
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


public class DivideByZero {
	public static void main(String args[]) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.printf("%d divides by %d results to %d\n", a, b, (a/b));
		} catch (NumberFormatException ne) {
			System.out.println("Numbers are not correctly formatted.");
		} catch (ArithmeticException ex) {
			System.out.println("Dive by zero");
		} catch (ArrayIndexOutOfBoundsException ax) {
			System.out.println("Array Index not in range");
		} finally {
			System.out.println("Ah! Thanks to Exception handling. I can be called with its help.");
			System.out.println("I\'m over. Bye!");
		}
	}
}

