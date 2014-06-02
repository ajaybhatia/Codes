public class PrimeChecker {
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		System.out.println("Is " + n + " prime? " + isPrime(n));
	}
}
