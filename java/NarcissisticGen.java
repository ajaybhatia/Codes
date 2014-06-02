public class NarcissisticGen {
	public static int pow(int x, int y) {
		if (y == 0)
			return 1;
		else
			return x * pow(x, y - 1);	
	}
	
	public static boolean isNarcissistic(long n) {
		long temp = n;
		long num = 0;
		int length = String.valueOf(n).length();
		
		while (n > 0) {
			long digit = n % 10;
			n /= 10;
			num += Math.pow((int)digit, length);	
		}	
			
		return (num == temp) ? true : false;
	}
	
	public static void main(String[] args) {
		for (int i = 100; i <= 100000000; i++)
			if (isNarcissistic(i))
				System.out.println(i);
	}
}
