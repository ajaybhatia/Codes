/*
 * reverse.c
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
#include <string.h>

int power(int x, int y)
{
	if (y == 0)
		return 1;
	else
		return x * power(x, --y);
}

int main(int argc, char **argv)
{
	int n, len, num = 0, temp;
	char str[7];
	
	printf("Enter any number: ");
	scanf("%d", &n);
	
	temp = n;
	sprintf(str, "%d", n);
	len = strlen(str) - 1;
	
	while (temp > 0)
	{
		num += ((temp % 10) * power(10, len--));
		temp /= 10;
	}
	
	if (n == num)
		printf("%d is palindrome.", n);
	else
		printf("%d is not palindrome.", n);
	
	
	printf("\n");
	
	return 0;
}

