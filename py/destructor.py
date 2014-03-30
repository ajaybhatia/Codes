#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  destructor.py
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

from math import pi

class Circle:
	'''
	A constructor to create and initialize an object
	'''
	def __init__(self, radius):
		self.radius = radius
		
	'''
	Perimeter methd to return perimeter of a circle
	'''
	def perimeter(self):
		return 2 * pi * self.radius
		
	'''
	Area method to get radius of a circle
	'''	
	def area(self):
		return pi * self.radius**2
		
	'''
	A destructor to destroy object
	'''
	def __del__(self):
		print "%s destroyed..." % self.__class__.__name__
		
	def __repr__(self):
		return self.__class__.__name__

def main():
	c1 = Circle(10.34)
	c2 = Circle(3.5)
	c3 = Circle(10)
	
	print "Perimeter of %s is %f" % (c1.__class__.__name__, c1.perimeter())
	print "Perimeter of %s is %f" % (c1.__class__.__name__, c1.perimeter())
	print "Perimeter of %s is %f" % (c1.__class__.__name__, c1.perimeter())
	
	print "Area of %s is %f" % (c1, c1.area())
	
	
	return 0

if __name__ == '__main__':
	main()

