/*
 * recursion.c
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

#include <stdio.h>

int fact(int n)
{
	int fact = 1, i;
	for (i = n; i > 0; i--)
		fact *= i;
		
	return fact;
}
	
int fact_r(int n) 
{
	if (n == 0)
		return 1;
	else
		return n * fact_r(n - 1);
}

int main(int argc, char **argv)
{
	printf("Factorial of %d is %d\n", 5, fact(5));
	printf("Factorial of %d is %d\n", 7, fact_r(7));
	
	return 0;
}

