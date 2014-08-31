#!/bin/bash
#
#  system-info.sh
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
#  This script prints all the system information  
#

KEYWORDS=(bios-vendor bios-version bios-release-date\  
			system-manufacturer system-product-name\ 
			system-version system-serial-number\  
			system-uuid baseboard-manufacturer\
			baseboard-product-name baseboard-version\  
			baseboard-serial-number baseboard-asset-tag\
            chassis-manufacturer chassis-type\  
            chassis-version chassis-serial-number\
            chassis-asset-tag processor-family\ 
            processor-manufacturer processor-version\
			processor-frequency)
              
for val in ${KEYWORDS[@]}; do
	## Use this
	#temp=`echo $val | sed 's/-/ /g' | tr '[A-Z]' '[a-z]' | sed 's/\(^\| \)\([a-z]\)/\1\u\2/g'`
	#printf "%-23s : %s\n" "$temp" "`dmidecode -s $val`"
	
	# or this
	temp=`echo $val | sed 's/-/ /g'`
	temp_arr=( $temp )
	temp="${temp_arr[@]^}"
	printf "%-23s : %s\n" "$temp" "`dmidecode -s $val`" 
	
	# Both display same results
done        
