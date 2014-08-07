/**
 * A B C D E
 * B A C D E
 * C B A D E
 * D C B A E 
 * E D C B A	  
 */

public class PatternABC {
	public static void main(String[] args) {
		String pattern = args[0];

		for (int i = 0; i < pattern.length(); i++)
			System.out.println(new StringBuilder(pattern.substring(0, i + 1)).reverse() + pattern.substring(i + 1));
	}
}
