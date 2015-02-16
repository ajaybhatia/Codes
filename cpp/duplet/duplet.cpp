/*
 * duplet.cpp
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

#include "duplet.h"

Duplet::Duplet(int val)
{
	x = y = val;
}

Duplet::Duplet(int a, int b)
{
	x = a;
	y = b;
}

Duplet::Duplet(const Duplet &d)
{
	x = d.x;
	y = d.y;
}

int Duplet::greatest()
{
	return (x > y) ? x : y;
}

int Duplet::smallest()
{
	return (x < y) ? x : y;
}

int Duplet::lcm()
{
	int a = greatest();
	
	while (true)
	{
		if (a % x == 0 && a % y == 0)
			return a;
			
		++a;
	}
}

int Duplet::gcd()
{
	int a = greatest();
	int b = smallest();
	int r = b;
	
	while (a % b != 0)
	{
		r = a % b;
		a = b;
		b = r;
	}
	
	return r;
}
