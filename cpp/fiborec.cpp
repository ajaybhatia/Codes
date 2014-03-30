/*
 * fiborec.cpp
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

/*
1 2 3 4 5 6 7  8  9  10 11 12  13
----------------------------------
1 1 2 3 5 8 13 21 34 55 89 144 233

f(1) = 1
f(2) = 1
f(n) = f(n - 1) + f(n - 2)
*/

int fibterm(int n)
{
	if (n == 1)
		return 1;
	else if (n == 2)
		return 1;
	else
		return fibterm(n - 1) + fibterm(n - 2);
}

#include <iostream>

using namespace std;

int main(int argc, char **argv)
{
	int term;
	
	cout << "Enter terms: ";
	cin >> term;
	
	for (int i = 1; i <= term; i++)
		cout << fibterm(i) << " ";
	
	cout << endl;
	
	return 0;
}

