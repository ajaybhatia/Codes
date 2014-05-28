import java.util.Scanner;

public class NumberToWordUsingSwitchCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int n = scan.nextInt();

		switch (n) {
			case 0:
				System.out.print("ZERO");
				break;

			case 1:
				System.out.print("ONE");
				break;

			case 2:
				System.out.print("TWO");
				break;

			case 3:
				System.out.print("THREE");
				break;

			case 4:
				System.out.print("FOUR");
				break;

			case 5:
				System.out.print("FIVE");
				break;

			case 6:
				System.out.print("SIX");
				break;

			case 7:
				System.out.print("SEVEN");
				break;

			case 8:
				System.out.print("EIGHT");
				break;

			case 9:
				System.out.print("NINE");
				break;

		}						
	}
}

