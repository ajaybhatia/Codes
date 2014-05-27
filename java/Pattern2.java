/*
 * 2 4 6 8 10 12 14 16 18 20
 * 3 6 9 12 15 18 21 24 27 30
 * 4 8 12 16 ..............
 * ...............
 * ...........
 */

public class Pattern2 {
	public static void main(String[] args) {
		int n = 2;
		
		for (int i = 1; i <= (Integer.parseInt(args[0]) - 1); i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%5d ", (n * j)); 
			}
			
			n++;
			System.out.println();
		}
	}
}
