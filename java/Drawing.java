/*
 * Drawing.java
 * 
 * Copyright 2014 Ajay Bhatia <ajay@arch>
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

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Drawing extends JFrame {
	private Canvas canvas;
	
	public Drawing() {
		canvas = new Canvas();
		
		add(canvas);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1300, 800);
		setVisible(true);
	}
	
	private class Canvas extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.orange);
			g.fillRect(10, 10, 190, 190);
			g.setColor(new Color(100, 200, 67));
			g.fillRect(50, 50, 250, 250);
			g.setColor(Color.red);
			g.fillOval(300, 10, 200, 200);
			g.setColor(Color.cyan);
			g.fillRoundRect(350, 200, 450, 300, 30, 30);
			g.setColor(Color.black);
			g.fillArc(200, 200, 100, 100, 30, 300);
		}
	}

	
	public static void main(String args[]) {
		new Drawing();
	}
}

