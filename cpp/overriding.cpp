/*
 * overriding.cpp
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

#include <iostream>

using namespace std;

class A
{
	public:
		virtual void show()
		{
			cout << "A" << endl;
		}
};

class B : public A
{
	public:
		virtual void show()
		{
			cout << "B" << endl;
		}
};

class C : public B
{
	public:
		virtual void show()
		{
			cout << "C" << endl;
		}	
};

int main(int argc, char **argv)
{
	C obj;
	
	A &base = obj;
	
	base.show(); // (*). ~ ->	
	
	return 0;
}

