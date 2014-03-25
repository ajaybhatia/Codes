/*
 * inheritance.cpp
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
#include <string>

using namespace std;

class Parent
{
	protected:
		string greetings;
		
	public: 
		Parent()
		{
			cout << "Parent's constructor" << endl;
		}
		
		Parent(string greetings)
		{
			this->greetings = greetings;
		}
};

class Child : public Parent
{
	protected:
		string name;
		
	public:
		Child()
		{
			cout << "Child's constructor" << endl;
		}
		
		Child(string greetings, string name) : Parent(greetings)
		{
			this->name = name;
		}
};

class SubChild : public Child
{
	public:
		SubChild()
		{
			cout << "SubChild's constructor" << endl;
		}
		
		SubChild(string greetings, string name) : Child(greetings, name)
		{
		}
		
		void show()
		{
			cout << "Hi, " << name << "! " << greetings << endl;
		}
};

int main(int argc, char **argv)
{
	SubChild subChild1;
	SubChild subChild2("Good Morning", "Danny.");
	
	subChild2.show();
	
	return 0;
}

