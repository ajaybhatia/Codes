/*
 * Primes.groovy
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


public class Primes {
	public static void main(args) {
		(2..Integer.parseInt(args[0])).each { num ->
			def isPrime = true
			(2..Math.sqrt(num)).each { item ->
				if (num != 2 && num % item == 0) {
					isPrime = false
				}
			}
			
			if (isPrime)
				println num
		}
	}
}
