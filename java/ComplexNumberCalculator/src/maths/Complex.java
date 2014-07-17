package maths;

public class Complex {
	private double real;
	private double imaginary;

	public  Complex() {}
	
	public Complex(double val) {
		real = imaginary = val;
	}

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex add(Complex c) {
		Complex temp = new Complex();
		temp.real = this.real + c.real;
		temp.imaginary =  this.imaginary + c.imaginary;
		return temp;
	}

	public Complex prod(Complex c) {
		Complex temp = new Complex();
		temp.real = this.real * c.real - this.imaginary * c.imaginary;
		temp.imaginary =  c.real * this.imaginary + this.real * c.imaginary;
		return temp;
	}

	@Override
	public String toString() {
		String sign = (imaginary >= 0) ? " + " : " - ";
		return real + sign + Math.abs(imaginary) + "i";  
	}
}