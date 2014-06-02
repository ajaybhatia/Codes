public class PowerOf2Checker {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		System.out.println("Is " + n + " divisible by power of 2? " + isPowerOf2_2(n));
	}	
	
	public static boolean isPowerOf2_1(int n) {
		for (int i = 1; i <= n; i *= 2) {
			if (n % i != 0)
				return false;
		}
		
		return true;
	}
	
	public static boolean isPowerOf2_2(int n) {
		while (n > 1) {
			if (n % 2 != 0)
				return false;
				
			n /= 2;
		}
		
		return true;
	}
	
}
