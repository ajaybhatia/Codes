/*
 * bubblesort.c
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

int main(int argc, char **argv)
{
	int a[10];
	int i, j, n;
	
	// Input size
	printf("Enter size of an array: ");
	scanf("%d", &n);
	
	// Input elements
	printf("Enter %d elements of an array:\n", n  );
	for (i = 0; i < n; i++)
		scanf("%d", &a[i]);
		
	// Bubble sort	
	for (i = 0; i < n; i++) {
		for (j = 0; j < n - i - 1; j++) {
			if (a[j] > a[j + 1]) {
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
	
	// Output sorted list
	for (i = 0; i < n; i++)
		printf("%d ", a[i]);
		
	printf("\n");
	return 0;
}

