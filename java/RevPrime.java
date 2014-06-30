/**
 * 2-100 Primes
 * Reverse
 * are reverse prime, if yes than sort them
 */

// 2 3 5 7 11 13 17 19 23 27 31 37 41 ....
// 2 3 5 7 11 31 71 91 32 72 13 73 14 ....
// 2 3 5 7 11 31 71 13 73 .....


import java.util.ArrayList;
import java.util.Collections;

public class RevPrime {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		for (int i = 2; i <= 100; i++) {
			if (PrimeChecker.isPrime(i)) {
				int n = PalindromeNumber.reverse(i);
				if (PrimeChecker.isPrime(n))
					//System.out.print(n + " ");
					list.add(n);
			}
		}
		
		Collections.sort(list);
		System.out.println(list);
	}
} 
