public class Voting {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		System.out.println((age >= 18) ? "You are eligible to vote." : "You are ineligible to vote.");
	}
}	
