/*
 * JavaReflection.java
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class JavaReflection {
	// This is for java.util.? classes
	public static void main (String args[]) {
		try {
			Class<?> aClass = Class.forName(args[0]);
			Constructor constructor = aClass.getConstructor();
			Object object = constructor.newInstance();
			Method method = aClass.getDeclaredMethod("add", Object.class);
			
			for (int i = 1; i < args.length; i++)
				method.invoke(object, args[i]);
			
			System.out.println(object);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

