/*
 * permutationofstring.cpp
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

/*
 * Program to print all permutations of a given string
 */ 
 
#include <iostream>
#include <cstring>

using namespace std;

void swap(char *a, char *b)
{
	char temp = *a;
	*a = *b;
	*b = temp;
}

void permute_swap(char *str, int i, int n)
{
	if (i == n)
		cout << str << endl;
	else
	{
		for (int j = i; j < n; j++)
		{
			// Backtracking
			swap(str[i], str[j]);
			permute_swap(str, i + 1, n);
			swap(str[i], str[j]);
		}
	}
}

void permute(char *str)
{
	permute_swap(str, 0, strlen(str));
}

int main()
{
	char *word;
	
	cout << "Enter any word: ";
	cin >> word;
	
	permute(word);
	
	return 0;
}
