#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  sumofseries.py
#  
#  Copyright 2014 Ajay Bhatia <ajay@dumb-box>
#  
#  This program is free software; you can redistribute it and/or modify
#  it under the terms of the GNU General Public License as published by
#  the Free Software Foundation; either version 2 of the License, or
#  (at your option) any later version.
#  
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
#  
#  You should have received a copy of the GNU General Public License
#  along with this program; if not, write to the Free Software
#  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
#  MA 02110-1301, USA.
#  
#  

# 1 + 2 / 2! + 3 / 3! + 4 / 4! + ... + n / n!

# 1 + 1 + 0.5 + 0.16666 = 2.

def fact(n):
	fact = 1
	for i in range(1, n + 1):
		fact *= i
		
	return fact

def sum(n):
	sum = 0.0
	for i in range(1, n + 1):
		sum += float(i) / fact(i)
		
	return sum

def main():
	print sum(1000)
	return 0

if __name__ == '__main__':
	main()

