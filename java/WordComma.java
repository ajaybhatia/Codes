/*
 * WordComma.java
 * 
 * Copyright 2015 Ajay Bhatia <ajay@dumb-box>
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
import java.io.File;
import java.io.PrintWriter;

public class WordComma {
	public static void main (String args[]) throws Exception {
		Scanner scan = new Scanner(new File("Data.txt"));
		
		String paragraph = scan.nextLine();
		paragraph = paragraph.replaceAll(",", "").replaceAll(" ", ",");
		
		PrintWriter fw = new PrintWriter(new File("Temp.txt"));
		fw.write(paragraph);

		fw.close();
	}
}

