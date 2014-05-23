import java.util.Scanner;

public class SumOfOdds {
	public static void main(String[] args) {
		System.out.print("Enter some number: ");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= (2 * n + 1); i += 2)
			sum += i;
			
		System.out.println("Sum of first " + n + " odd numbers is " + sum);
	}
}
