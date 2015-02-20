#!/usr/bin/env python2
# -*- coding: utf-8 -*-
#
#  kernel-org.py
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

import os
import urllib2
import simplejson
import getpass

from subprocess import call

def main():
	#if os.uname()[0] == 'Linux' or os.uname()[0] == 'Unix':
	#	call(['clear'])
	#else:
	#	call(['cls'])
	#	call(['echo', 'Still no support for Windows platform'])
	#	return 1
		
	req = urllib2.Request('https://www.kernel.org/releases.json')
	js = simplejson.load(urllib2.build_opener().open(req))
	
	for i in range(len(js['releases'])):
		if js['releases'][i]['moniker'] == 'mainline':
			if not os.path.isdir('/home/' + getpass.getuser() + '/Downloads/Kernels/Patches'):
				os.mkdir('/home/' + getpass.getuser() + '/Downloads/Kernels/Patches', 0755)

			os.chdir('/home/' + getpass.getuser() + '/Downloads/Kernels/Patches')
			if not os.path.exists('/home/' + getpass.getuser() + '/Downloads/Kernels/Patches/patch-' + js['releases'][i]['version'] + '.xz'):
				call(['/usr/bin/notify-send', 'Kernel {} released'.format(js['releases'][i]['version']), \
					'Downloading {} patch in ~/Downloads/Kernels/Patches Folder'.format(js['releases'][i]['version'])]) 
				call(['wget', js['releases'][i]['patch']['full']])
				call(['/usr/bin/notify-send', 'Kernel {} released'.format(js['releases'][i]['version']), \
					'Downloading incremental {} patch in ~/Downloads/Kernels/Patches Folder'.format(js['releases'][i]['version'])]) 
				call(['wget', js['releases'][i]['patch']['incremental']])
				call(['/usr/bin/notify-send', 'Download Complete.'])	
			else:
				call(['/usr/bin/notify-send', 'No updates available']) 
			break	
	
	return 0

if __name__ == '__main__':
	main()

