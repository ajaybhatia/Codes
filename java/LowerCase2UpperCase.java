import java.util.Scanner;

public class LowerCase2UpperCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
	
		System.out.print("Enter a lowercase character: ");
		char ch = s.next().charAt(0);

		System.out.println(ch + "\'s Uppercase is " + (char)(ch - 32));
	}		
}
