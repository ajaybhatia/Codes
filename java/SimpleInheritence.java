/*
 * SimpleInheritence.java
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

class A {
	private int a;
	
	A() {
		a = 10;
		System.out.println("A class\'s constructor");
		//System.out.println("a = " + a);
	}
}

class B extends A {
	protected int b;
	
	B() {
		b = 20;
		System.out.println("B class\'s constructor");
		//System.out.println("b = " + b);
	}
}

class C extends A {
	private int c;
	
	C() {
		c = 30;
		System.out.println("C class\'s constructor");
		//System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}

public class SimpleInheritence {
	public static void main (String args[]) {
		C obj = new C();
		obj.b = 50;
		System.out.println("b = " + obj.b);
	}
}

