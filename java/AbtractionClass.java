/*
 * AbtractionClass.java
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

abstract class Shape {
	protected float size; // Private members cannot be inherited
	
	public void setSize(float size) {
		this.size = size;
	}
	
	public float getSize() {
		return size;
	}
	
	public abstract float getArea(); 
	public abstract float getPerimeter();
}


class Circle extends Shape {
	
	@Override
	public float getArea() {
		return (float	)Math.PI * size * size;
	}
	
	@Override
	public float getPerimeter() { 
		return 2 * (float)Math.PI * size; 
	}
	
	@Override
	public String toString() {
		return size + "";
	}	
}

class Square extends Shape {
	
	@Override 
	public float getArea() {
		return size * size;
	}
	
	@Override
	public float getPerimeter() { 
		return 4.0f * size; 
	}
}

public class AbtractionClass {
	public static void main(String args[]) {
		Shape shape = new Circle();
		
		shape.setSize(10);
		System.out.println(shape.getArea());
		System.out.println(shape.getPerimeter());
		
		Shape square = new Square();
		
		square.setSize(20);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
	}
}

