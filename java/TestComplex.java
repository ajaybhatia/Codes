import maths.Complex;

public class TestComplex {
	public static void main(String[] args) {
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(2, 3);
		Complex c3 = new Complex();

		c3 = c1.add(c2);
		System.out.println(c3);

		c3 = c1.prod(c2);
		System.out.println(c3);		
	}
}