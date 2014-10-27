/*
 * FanApplet.java
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

import javax.swing.JPanel;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FanApplet extends JApplet {
	private FanCanvas canvas;
	private JPanel pnlButtons;
	private boolean flag = true;
	private JButton btnON;
	private JButton btnOFF;
	private Timer timer;
	
	@Override
	public void init() {
		canvas = new FanCanvas();
		btnOFF = new JButton("OFF");
		btnON = new JButton("ON");
		pnlButtons = new JPanel();
		
		pnlButtons.setLayout(new FlowLayout());
		pnlButtons.add(btnOFF);
		pnlButtons.add(btnON);
		
		setLayout(new BorderLayout());	
		add(canvas, "Center");
		add(pnlButtons, "South");
		
		timer = new Timer(1, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (flag) {
					canvas.setFlip(flag);
					canvas.repaint();
					flag = false;
				} else {
					canvas.setFlip(flag);
					canvas.repaint();
					flag = true;
				}
			}	
		});
		
		btnOFF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.stop();
			}
		});
		
		btnON.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
}

class FanCanvas extends JPanel {
	private static final int INIT_ANGLE = 45;
	private static final int ARC_LENGTH = 45;
	private static final int RADIUS = 200;
	
	private boolean flip;
	
	public void setFlip(boolean flip) {
		this.flip = flip;
	}
	
	public boolean isFlip() {
		return flip;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (isFlip()) {
			g.fillArc(getWidth() / 2 - 100, getHeight() / 2 - 100, RADIUS, RADIUS, INIT_ANGLE, ARC_LENGTH);
			g.fillArc(getWidth() / 2 - 100, getHeight() / 2 - 100, RADIUS, RADIUS, 3 * INIT_ANGLE, ARC_LENGTH);
			g.fillArc(getWidth() / 2 - 100, getHeight() / 2 - 100, RADIUS, RADIUS, 5 * INIT_ANGLE, ARC_LENGTH);
			g.fillArc(getWidth() / 2 - 100, getHeight() / 2 - 100, RADIUS, RADIUS, 7 * INIT_ANGLE, ARC_LENGTH);
		} else {
			g.fillArc(getWidth() / 2 - 100, getHeight() / 2 - 100, RADIUS, RADIUS, 2 *INIT_ANGLE, ARC_LENGTH);
			g.fillArc(getWidth() / 2 - 100, getHeight() / 2 - 100, RADIUS, RADIUS, 4 * INIT_ANGLE, ARC_LENGTH);
			g.fillArc(getWidth() / 2 - 100, getHeight() / 2 - 100, RADIUS, RADIUS, 6 * INIT_ANGLE, ARC_LENGTH);
			g.fillArc(getWidth() / 2 - 100, getHeight() / 2 - 100, RADIUS, RADIUS, 8 * INIT_ANGLE, ARC_LENGTH);
		}
	}
}
