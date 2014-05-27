/*
 * #   #   #   #   #
 *   #   #   #   #
 *     #   #   #
 *       #   #
 *         #
 */
 
 public class Pattern7 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i - 1; k++)
				System.out.print("  ");
				
			for (int j = 0; j <= n - i; j++) 
				System.out.print("#   ");
			
			System.out.println();
		}
	}
 }
