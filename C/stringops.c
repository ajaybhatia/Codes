/*
 * stringops.c
 * 
 * Copyright 2015 Ajay Bhatia <ajay@dumb-box>
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
#include <stdlib.h>

char* scan(void)
{
	char *str = NULL, ch;
	int index = 0;
	int b_size = 1024;
	
	str = malloc(b_size);
	
	while ((ch = getchar()) != '\n')
	{
		str[index++] = ch;
		
		if (index == b_size)
		{
			b_size += b_size;
			if (!(str = realloc(str, b_size)))
				fprintf(stderr, "Out of memory!\n");
		}
	}
	
	str[index] = '\0';
	
	return str;
}
