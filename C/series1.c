/*
 * series1.c
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
 * 1^1 + 2^2 + 3^3 + 4^4 + .... + n^n
 * 
 */

#include <stdio.h>

int power(int x, int y);

int main(int argc, char **argv)
{
	int n, i, sum = 0;
	
	printf("Input value of n: ");
	scanf("%d", &n);
	
	
	for (i = 1; i <= n; i++)
		sum += power(i, i);
		
	printf("Sum of series up to %d is %d\n", n, sum);
	
	return 0;
}

int power(int x, int y)
{
	int pow = 1, i;
	
	for (i = 1; i <= y; i++) 
		pow = pow * x; // pow *= x;
		
	return pow;
}
