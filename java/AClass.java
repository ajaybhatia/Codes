/*
 * AClass.java
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

class Circle {
	private float radius;
	
	Circle() {
		radius = 1.0f;
	}
	
	Circle(float r) {
		radius = r;
	}
	
	float area() {
		return 3.141567f * radius * radius;	
	}
	
	float perimeter() {
		return 2 * 3.14156f * radius;
	}
	
	@Override //Annotation
	public String toString() {
		return "Radius of this circle object is " + radius;
	}
}

public class AClass {	
	public static void main(String args[]) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(12.4f);
		Circle c3 = new Circle();

		System.out.println("Area of c1 = " + c1.area());
		System.out.println("Area of c2 = " + c2.area());
		System.out.println("Area of c3 = " + c3.area());
		
		System.out.println("Perimeter of c1 = " + c1.perimeter());
		System.out.println("Perimeter of c2 = " + c2.perimeter());
		System.out.println("Perimeter of c3 = " + c3.perimeter());
		
		System.out.println(c1);
		System.out.println();
		System.out.println(c3);
	}
}

