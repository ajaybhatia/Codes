/*
 * swapoddchar.cpp
 * 
 * Copyright 2015 Ajay Bhatia <ajay@arch>
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
#include <cstring>

using namespace std;

char* swap_odd(char *word)
{
	char *str = word;
	
	for (int i = 0; i < strlen(str); i += 3)
	{
		char temp = str[i];
		str[i] = str[i + 2];
		str[i + 2] = temp;
	}
		
	return str;
}

int main()
{
	char *word;
	
	cout << "Enter a word: ";
	cin >> word;
	
	cout << swap_odd(word) << endl;
	
	return 0;
}

