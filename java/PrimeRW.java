/*
 * PrimeRW.java
 * 
 * Copyright 2014 Ajay Bhatia <ajay@arch>
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

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class PrimeRW {
	public static boolean isPrime(int n) {
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String args[]) throws Exception {
		int n = Integer.parseInt(args[0]);
		
		// For Writing to "Primes.txt"
		FileWriter fw = new FileWriter(new File("Primes.txt"));
		
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) 
				fw.write(i + "\n");
		}
		
		fw.close();
		
		// For Reading from "Primes.txt";
		Scanner scan = new Scanner(new File("Primes.txt"));
		
		while (scan.hasNextLine()) {
			try {		
				System.out.print(scan.nextInt() + " ");
			} catch (Exception e) {}
		}
		
		System.out.println();
	}
}
