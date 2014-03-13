/*
/*
 * complex2.cpp
 * 
 * Copyright 2014 Ajay Bhatia <ajay@dumb-box>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


/* Second version of complex number representation in C++ */

#include <iostream>
#include <cmath>

using namespace std;

class Complex
{
	private:
		double real;
		double img;
	
	public:
		// Default constructor
		Complex() { real = img = 0.0; }
		// Constructor for initializing both real and img with same value
		Complex(double);
		// Constructor for initializing both real and img with different value
		Complex(double, double);
		// Addition for two complex numbers
		Complex add(Complex);
		// Subtraction for two complex numbers
		Complex sub(Complex);
		// To print a complex number
		void print(); 
		
};

Complex::Complex(double val)
{
	real = img = val;
}

Complex::Complex(double real, double img)
{
	this->real = real;
	this->img = img;
}

Complex Complex::add(Complex c)
{
	Complex temp;
	temp.real = real + c.real;
	temp.img = img + c.img;
	return temp;
}

Complex Complex::sub(Complex c)
{
	Complex temp;
	temp.real = real - c.real;
	temp.img = img - c.img;
	return temp;
}

void Complex::print()
{
	cout << real << ((img < 0) ? " - " : " + ") << abs(img) << "i" << endl;
}

int main(int argc, char **argv)
{
	Complex c1;
	Complex c2(10.3);
	Complex c3(34.1256, -89.452);
	
	c1.print();
	c2.print();
	c3.print();
	
	c1 = c2.add(c3); // c2 + c3
	c1.print();
	
	c1 = c2.sub(c3); // c2 - c3
	c1.print();
	
	return 0;
}

