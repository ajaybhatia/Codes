/*
 * Greeting.java
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

package com.ajaybhatia.core;

/**
 * This class is just for fun purpose and have no real meaning while
 * using in real world.
 * 
 * <p>It contains getter and setter method to set <u>message</u> 
 * variable along an overriden toString() method and a constructor
 * 
 * @author	Ajay Bhatia
 * @version 1.0 
 */
public class Greeting {
	private String message;
	
	
	public Greeting(String message) {
		this.message = message;
	}
	
	/**
	 * Sets the @classvar message .
	 *
	 * @param message  the text for message
	 */	
	public void setMessage(String message) {
		this.message = message;
	}	

	/**
	 * Returns a string message. 
	 * <p>
	 * This method always returns a string message as set using
	 * setMessage() method or through constructor
	 *
	 * @param  message 
	 */	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return message;
	}
}

