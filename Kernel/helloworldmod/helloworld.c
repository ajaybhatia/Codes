/*
 * helloworld.c
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
 * This is the simplest helloworld kernel module program
 * 
 */

#include <linux/kernel.h> 						// Contains frequently used functions
#include <linux/module.h> 						// Include all kernel modules
#include <linux/moduleparam.h> 					// Include module_param() definition
#include <linux/sched.h>						// Required for current->com and current->pid

MODULE_LICENSE("GPL");							// Macro to specify the module license
MODULE_AUTHOR("Ajay Bhatia <ajay@dumb-box>"); 	// Macro to specify module author
MODULE_DESCRIPTION("First kernel module");		// Macro to specify description about module
MODULE_VERSION("0.1");							// Macro to specify the module version

static int count = 2;
static int i = 0;
module_param(count, int, S_IRUGO);				// Macro to take runtime argument for module


// Module Initialization function
static int __init hello_init(void) 
{
	for (i = 0; i < count; i++) {
		printk(KERN_ALERT "This is my first kernel module\n");
		printk(KERN_ALERT "The current running process in the system is: " \
			"%s\" (pid %i) \n", current->comm, current->pid);
	}
			
	return 0;
}	

// Module Exit function
static void __exit hello_exit(void)
{
	printk(KERN_ALERT "Good bye, we are done.\n");	
}

module_init(hello_init);
module_exit(hello_exit);
