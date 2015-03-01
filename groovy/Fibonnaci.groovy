/*
 * Fibonnaci.groovy
 * 
 * Copyright 2015 Ajay Bhatia <ajay@arch>
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

public class Fibonacci {
	def static fib(def n) {
		if (n == 1)
			return 1
		else if (n == 2)
			return 1
		else
			return fib(n - 1) + fib(n - 2)
	}
	
	def static fibo(def n) {
		if (n == 1)
			print 1
		else if (n == 2)
			print 1 + " " + 1
		else {		
			def a = 1
			def b = 1
			
			print a + " " + b + " "
			(3..n).each() { i ->
				def c = a + b
				print c + " "
				a = b
				b = c
			}
		}
		
		println ""
	}
	
	public static void main(args) {
		fibo(Long.parseLong(args[0]))
	}
}
