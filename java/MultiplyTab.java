public class MultiplyTab {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));			
			}		
			System.out.println();
		}
		
	}
}
