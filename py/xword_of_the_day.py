#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  xword_of_the_day.py
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

import re
import urllib2
from bs4 import BeautifulSoup
from subprocess import call

def main():
	page = urllib2.urlopen("http://www.merriam-webster.com/word-of-the-day/")
	doc = BeautifulSoup(page.read())
	word = doc.findAll("strong", { "class" : "main_entry_word" }).pop().string.upper() #title()
	length = len(word)
	hdrleaders = doc.find("strong", { "class" : "hdrleaders" })
	word_example_didu = doc.find("p", { "class" : "word_example_didu" })
	
	call(["xcowsay", "Today's word is '" + word + "'"])
	hdrleaders = hdrleaders.find_next("strong", { "class" : "hdrleaders" })
	call(["xcowsay", "It's '" + doc.findAll("p", { "class" : "word_function" }).pop().string + "'"])
	call(["xcowsay", "'" + word + "' means '" + re.sub('^ ', '', doc.findAll("span", { "class" : "ssens" }).pop().contents.pop()) +"'"]) 
	
	return 0

if __name__ == '__main__':
	main()

