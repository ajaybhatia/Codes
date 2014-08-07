public class SumOfDigits {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i < args[0].length(); i++) 
			sum += Integer.parseInt(String.valueOf(args[0].charAt(i)));

		System.out.println("Sum of the digits of " + args[0] + " is " + sum);
	}
}
