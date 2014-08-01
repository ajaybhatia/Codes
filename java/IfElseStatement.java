public class IfElseStatement {
	public static void main (String args[]) {
		int number = Integer.parseInt(args[0]);
		
		if (number % 2 == 0)
			System.out.println(number + " is even");
		else {
			System.out.println(number + " is odd");
			System.out.println("Wooh! We found odd");
		}
			
		System.out.println("Program terminates");
	}
}
