// 1 + 3 + 5 ... + nth = SUM

public class Series135 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		int i = 1, s = 1, sum = 0;
		while (i <= n) {
			if (i != n)
				System.out.print(s + " + ");
			else
				System.out.print(s);
				
			sum += s;
			
			s += 2;
			i++;
		}
		
		System.out.println(" = " + sum);
	}
}
