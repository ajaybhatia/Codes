public class Reverse {
	public static int pow(int x, int y) {
		if (y == 0)
			return 1;
		else
			return x * pow(x, y - 1);	
	}
	
	public static int reverse(int n) {
		int num = 0;
		int length = String.valueOf(n).length() - 1;
		
		while (n > 0) {
			int digit = n % 10;
			n /= 10;
			num += digit * pow(10, length--);
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		System.out.println("Reverse of " + n + " is " + reverse(n));
	}
}
