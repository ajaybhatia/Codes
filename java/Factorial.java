import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.print("Enter some number: ");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int prod = 1;
		
		for (int i = 1; i <= n; i++)
			prod = prod + i;
			
		System.out.println("Factorial of " + n + " is " + prod);
	}
}
