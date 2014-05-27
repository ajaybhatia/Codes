/**
 * * @ * @ * @
 * @ * @ * @ *
 * * @ * @ * @
 * @ * @ * @ *
 * * @ * @ * @
 * @ * @ * @ *
 */
 
public class Pattern4 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int b = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (n % 2 == 0) {
					if (i % 2 == 0) {
						if (b % 2 == 0)
							System.out.print("* ");
						else
							System.out.print("@ ");
					} else {
						if (b % 2 == 0)
							System.out.print("@ ");
						else
							System.out.print("* ");
					}
				} else {
					if (b % 2 != 0)
						System.out.print("* ");
					else
						System.out.print("@ ");
				}
					
				b++;
			}
			
			System.out.println();
		}
	}	
}
