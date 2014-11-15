#!/bin/bash
#
#  kcompile-arch.sh
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

# Change directory to kernel source directory
cd ~/kernelcompile/linux-*

# Clean the repo
make mrproper

# Recall modprobed-db for loading all modules to /proc/modules
# required for compiling a slim kernel with required
# only modules
sudo modprobed-db recall

# Create a .config file based on modules loaded in /proc/modules
make localmodconfig

# Open GUI config editor. One can also use 'menuconfig' or
# 'nconfig' instead of 'xconfig' 
make xconfig

# Retrieve CONFIG_LOCALVERSION value stored during last command
LOCALVERSION=`cat .config | grep LOCALVERSION= | cut -d'"' -f 2`

# Linux VERSION
VERSION=`head -1 Makefile | awk '{print $3}'`

# Linux PATCHLEVEL
PATCHLEVEL=`grep 'PATCHLEVEL =' Makefile | awk '{print $3}'`

# Linux SUBLEVEL
SUBLEVEL=`grep 'SUBLEVEL =' Makefile | awk '{print $3}'`

# MAKE fullkernelname
KERNEL_NAME=`echo $VERSION.$PATCHLEVEL.$SUBLEVEL$LOCALVERSION`

# Get number of cores
CORES=`getconf _NPROCESSORS_ONLN`

# Jobs to run
JOBS=$(($CORES * 2))

# make kernel with jobs
make -j$JOBS

# Install modules
sudo make modules_install

# Copy kernel image to /boot
sudo cp -v arch/x86/boot/bzImage /boot/vmlinuz-$KERNEL_NAME

# Link compiled modules with kernel and make initramfs
sudo mkinitcpio -k `find /lib/modules/ -name *"$LOCALVERSION"* | cut -d'/' -f 4` -c /etc/mkinitcpio.conf -g /boot/initramfs-$KERNEL_NAME.img

# Copy generated System.map to boot with fullkernelname
sudo cp System.map /boot/System.map-$KERNEL_NAME

# After this run grub-customizer to move menuitem with new kernel
# entry wherever you want. If grub-customizer is not installed,
# install using 'yaourt -S grub-customizer' and run it. If required
# I'm running it here
sudo grub-customizer

## Script ends


