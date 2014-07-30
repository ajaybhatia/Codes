// ax^2 + bx + c = 0

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		int a = in.nextInt();

		System.out.print("Enter value of b: ");
		int b = in.nextInt();

		System.out.print("Enter value of c: ");
		int c = in.nextInt();

		int disc = (b * b) - (4 * a * c);

		if (disc < 0) {
			System.out.println("Real roots of equation are not possible");	
			return;
		}

		double x1 = (-b + Math.sqrt(disc)) / (2 * a);	
		double x2 = (-b - Math.sqrt(disc)) / (2 * a);

		System.out.printf("First root = %.2f\nSecond root = %.2f\n", x1, x2);
	}
}
