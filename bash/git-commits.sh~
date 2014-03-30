#!/bin/bash
#
#  git-commits.sh
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

# This is purely my code for retrieving commits from GitHub - Authorization with me.
# Main Logic -->
#curl -s https://github.com/<username>/<reponame>/commits/master | grep 'tree/' | awk '{print $2}' | cut -d '/' -f 5 | uniq | sed 's/"//'

dirname=`echo $1 | cut -d '/' -f 4`_`echo $1 | cut -d '/' -f 5`_`echo patches`
patchlist=`echo $1 | cut -d '/' -f 4`_`echo $1 | cut -d '/' -f 5`_`echo patches.txt`
messagelist=`echo $1 | cut -d '/' -f 4`_`echo $1 | cut -d '/' -f 5`_`echo message.txt`
commithistory=`echo $1 | cut -d '/' -f 4`_`echo $1 | cut -d '/' -f 5`_`echo history.txt`

if [ -f $patchlist ]; then
	rm $patchlist
else
	touch $patchlist
fi

mkdir -p $dirname

page=1
while [ `curl -o /dev/null --silent --head --write-out '%{http_code}\n' $1/commits/$2?page=$page` == "200" ]; do
	#curl -s $1/commits/$2?page=$page | grep 'tree/' | awk '{print $2}' | cut -d '/' -f 5 | uniq | sed 's/"//' >> $patchlist
	curl -s $1/commits/$2?page=$page | grep 'class="message" data-pjax="true" title=' | cut -d '"' -f 8 | sed -r 's/\//-/g' >>$messagelist
	page=$(($page+1))
done

paste $patchlist $messagelist > $commithistory
	
cd $dirname
for patch in `cat ../$patchlist`; do
	wget $1/commit/$patch.diff
done 

rm ../$patchlist
rm ../$messagelist
mv ../$commithistory .
