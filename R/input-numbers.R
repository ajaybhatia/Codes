#!/usr/bin/env Rscript
#  input-numbers.R
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

# command read.csv() uses number os arguments but only three are used
# The first argument is the name of file. 
# The second argument indicates whether or not the first row is a set of labels. 
# The third argument indicates that there is a comma between each number of each line.

a <- 3
print(a)

b <- sqrt(a * a + 3)
print(b)

# To initialize a list of numbers the numeric command can be used
c <- numeric(10)
print(c)
