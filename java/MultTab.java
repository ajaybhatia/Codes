public class MultTab {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);	

		for (int i = 1; i <= b; i++)
			System.out.printf("%3d X %3d = %3d\n", a, i, (a*i));
	}
}
