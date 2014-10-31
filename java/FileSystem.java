/*
 * FileSystem.java
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
import java.util.Date;

public class FileSystem {
	
	public static void main(String args[]) {
		File file = new File("Sample.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println("Is " + file.getName() + "directory? " + file.isDirectory());
		System.out.println("Is " + file.getName() + "file? " + file.isFile());
		System.out.println(file.getName() + " is " + file.length() + " of size");
		System.out.println(file + " created on " + new Date(file.lastModified()));
		System.out.println("Can I create a directory in " + file + "? " + file.mkdir());
	}
}

