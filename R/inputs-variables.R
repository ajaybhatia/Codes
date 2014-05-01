#!/usr/bin/env Rscript
#  inputs-variable.R
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

# Run this file on R prompt by firing the following command:
# source("input-variables.R")

# c() command is used create a list or vector (c stands for "combine") 
vector <- c(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) # <- is an assignment operator in R

# print() command is used to print the variable created in last syntax
print(vector)

# 0 index stores the type of data in c()
print(vector[0])

# 3rd element of c() will be printed i.e. c()'s index starts from 1 rather than 0
print(vector[3])
