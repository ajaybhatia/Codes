// Application of the for loop for printing 1 to 100 integers on the screen

public class ForLoop {
	public static void main(String[] args) {
		for (char i = 'A', int val = 1; i <= 'Z'; i++, val++) {
			System.out.print(i + " ");
			if (val % 6 == 0)
				System.out.println();
		}
	}
}
