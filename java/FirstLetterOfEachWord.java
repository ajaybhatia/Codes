// Today the weather is really cool
// Output: Ttwirc

public class FirstLetterOfEachWord {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (i < args[i].length())
				System.out.print(args[i].charAt(i));		
			else
				System.out.print(args[i].charAt(args[i].length() - 1));
		}	

		System.out.println();
	}
}
