public class ArmstrongGen {
	public static boolean isArmstrong(int n) {
		int temp = n;
		
		int d1 = n % 10;
		n /= 10;
		int d2 = n % 10;
		n /= 10;
		int d3 = n % 10;
		
		int num = (d3 * d3 * d3) + (d2 * d2 * d2) + (d1 * d1 * d1);
		
		return (num == temp) ? true : false;
	}
	
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++)
			if (isArmstrong(i))
				System.out.println(i);
	}
}
