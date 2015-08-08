/*
 * MoreOnLambdaJava8.java
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

interface MathOperation {
	abstract int operation(int a, int b);
}

interface GreetingService {
	abstract void sayMessage(String message);
}

public class MoreOnLambdaJava8 {
	
	private int operate(int a, int b, MathOperation mathOp) {
		return mathOp.operation(a, b);
	}
	
	public static void main (String args[]) {
		MoreOnLambdaJava8 obj = new MoreOnLambdaJava8();
		
		int x = 10, y = 5;
		
		// Type declaration
		MathOperation addition = (int a, int b) -> a + b;
		
		// No type declaration
		MathOperation subtraction = (a, b) -> a - b;
		
		// With return statement and curly braces
		MathOperation multiplication = (int a, int b) -> { return a * b; };
		
		// Without return statement and no curly braces
		MathOperation division = (int a, int b) -> a / b;
		
		System.out.printf("%d + %d = %d\n", x, y, obj.operate(x, y, addition));
		System.out.printf("%d - %d = %d\n", x, y, obj.operate(x, y, subtraction));
		System.out.printf("%d * %d = %d\n", x, y, obj.operate(x, y, multiplication));
		System.out.printf("%d / %d = %d\n", x, y, obj.operate(x, y, division));
		
		// With paranthesis
		GreetingService greeting1 = message -> System.out.println("Hello, " + message);	
		
		// Without paranthesis
		GreetingService greeting2 = (message) -> System.out.println("Hello, " + message);	
		
		greeting1.sayMessage("World!");
		greeting2.sayMessage("Ajay!");
	}
}

