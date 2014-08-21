/*
 * WordyCount.java
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

public class WordyCount {
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter some newText: ");
		String text = scan.nextLine();
		
		String newText = text.toLowerCase();
		int vcount = 0, scount = 0;
		
		for (int i = 0; i < newText.length(); i++) {
			if ('a' == newText.charAt(i) || 'e' == newText.charAt(i) 
				|| 'i' == newText.charAt(i) || 'o' == newText.charAt(i) 
				|| 'u' == newText.charAt(i))
				vcount++;
			
			if (newText.charAt(i) == ' ')
				scount++;	
		}
		
		System.out.println("Character count: " + text.length());
		System.out.println("Vowel count    : " + vcount);
		System.out.println("Space(s) count : " + scount++);
	}
}

