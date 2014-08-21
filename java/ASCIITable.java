
public class ASCIITable {
	public static void main (String args[]) {
		int count = 0;
		for (char c = '!'; c <= '~'; c++) {
			if (count++ % 10 == 0)
				System.out.println();
				
			System.out.print(c + "\t");
		}
		
		System.out.println();
	}
}

