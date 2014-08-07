public class DiffPattern {
	public static void main(String[] args) {
		StringBuilder pattern = new StringBuilder("+ - % / *");
		int n = Integer.parseInt(args[0]);
	
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1)
				System.out.println(pattern);
			else {
				System.out.println(pattern.reverse());
				pattern.reverse();
			}
		}
	}	
}
