#!/usr/bin/env python2
# -*- coding: utf-8 -*-
#
#  permute.py
#  
#  Copyright 2015 Ajay Bhatia <ajay@arch>
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

import sys
import itertools

def permute(word):
	return ["".join(x) for x in itertools.permutations(word, len(word))]

def main(word):
	for single in permute(word):
		print single
		
	return 0

if __name__ == '__main__':
	try:
		main(sys.argv[1])
	except IndexError:
		print "Usage: permute.py <word>"
		
