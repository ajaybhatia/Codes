public class IfElseIfElse {
	public static void main (String args[]) {
		int number = Integer.parseInt(args[0]);
		
		if (number > 0)
			System.out.println(number + " is positive.");
		else if (number == 0)
			System.out.println(number + " is zero.");
		else 
			System.out.println(number + " is negative.");
	
	}
}
