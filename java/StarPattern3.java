/**
 *          *
 *        *   *
 *      *   *   *
 *    *   *   *   *
 *  *   *   *   *   *
 */

public class StarPattern3 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n - i); k++)
				System.out.print(" ");			

			for (int j = 1; j <= i; j++) 
				System.out.print("* ");
			

			System.out.println();
		}		
	}
}
