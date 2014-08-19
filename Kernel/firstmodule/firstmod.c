/*
 * firstmod.c
 * 
 * Copyright 2014 Ajay Bhatia <ajay@dumb-box>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


#include <linux/init.h>
#include <linux/kernel.h>
#include <linux/module.h>

static int __init hi(void)
{
	printk(KERN_INFO "User-defined module is loaded.\n");
	return 0;
}

static void __exit bye(void)
{
	printk(KERN_INFO "User-defined module is unloaded.\n");
}

module_init(hi);
module_exit(bye);

MODULE_AUTHOR("Ajay Bhatia <ajay@dumb-box>");
MODULE_LICENSE("GPL");
MODULE_DESCRIPTION("A simple test module");
