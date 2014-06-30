/* Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. 
 * For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:
 *
 * *********
 * * Hello *
 * * World *
 * * in    *
 * * a     *
 * * frame *
 * *********
 */

public class RectangularFrame {
	private static int largestStringSize(String[] args) {
		int maxLength = 0;
		String longestString = null;
		for (String s : args) {
			if (s.length() > maxLength) {
				maxLength = s.length();
				longestString = s;
			}
		}

		return longestString.length();		
	}

	public static void printFrame(String[] args) {
		int size = largestStringSize(args) + 4;
		
		for (int i = 0; i != args.length + 1; i++) {
			if (i == 0 || i == args.length) { 
				for (int j = 0; j < size; j++)
					System.out.print("*");
				System.out.println();
				if (i == args.length) 
					break;
			}
			
			String format = "* %-" + (size - 4) + "s *\n";
			System.out.printf(format, args[i]);	
		}
	}

	public static void main(String[] args) {
		printFrame(args);	
	}
}
