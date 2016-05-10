#!/bin/bash
#
#  gitall.sh
#  
#  Copyright 2014 Ajay Bhatia <ajay@arch>
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

ACCOUNT_TYPE=$1
ACCOUNT_NAME=$2
PAGES=1

if [ $# -lt 2 ]; then
	echo
	echo "Usage: gitall.sh <account_type> <account_name> <pages>"
	echo
	echo "account_type:"
	echo "  organization        For cloning from organization account"
	echo "  user                For cloning from user account"
	echo
	echo "account_name          Name of the account from where to clone"
	echo 
	echo "pages                 Number of pages to clone. Default is 1"
	echo
else
	if [ -z "$3" ]; then
		PAGES=1
	else
		PAGES=$3
	fi
	
	case $ACCOUNT_TYPE in
	"organization")
		curl "https://api.github.com/orgs/$ACCOUNT_NAME/repos?page=$PAGES&per_page=100" | grep -e 'git_url*' | cut -d \" -f 4 | xargs -L1 git clone
		;;
	"user")
		curl "https://api.github.com/users/$ACCOUNT_NAME/repos?page=$PAGES&per_page=100" | grep -e 'git_url*' | cut -d \" -f 4 | xargs -L1 git clone
		;;
	*)
		echo
		echo "Wrong <account_type>. It can be organization or user only."
		echo
		exit 1
	esac
fi;
