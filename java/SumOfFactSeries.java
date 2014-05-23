// 1! + 2! + 3! + .. + n! = SUM

import java.util.Scanner;

public class SumOfFactSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int n = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int fact = 1;
			for (int j = 1; j <= i; j++) 
				fact *= j;
			
			sum += fact;
			
			System.out.print((i != n) ? (i + "! + ") : (i + "!")); 
		}
		
		System.out.println(" = " + sum);
		
	}
}
