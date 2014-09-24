/*
 * InterfaceDemo.java
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

interface Fruit {
	public void taste();
	public void fragnance();
}

interface Vegetable {
	public void color();
}

class Person {
}

class Brinjal extends Person implements Fruit, Vegetable {
	public void taste() {
		//System.out.println("Mango is sweet");
	}
	
	public void fragnance() {
		//System.out.println("Mango has very attractive aroma");
	}
	
	public void color() {}
}

public class InterfaceDemo {
	public static void main (String args[]) {
		Mango mango = new Mango();
		
		mango.taste();
		mango.fragnance();
	}
}

