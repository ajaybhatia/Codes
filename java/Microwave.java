/*
 * Microwave.java
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

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ajay
 */
public class Microwave extends JFrame {

    public Microwave() {
        JPanel p1 = new JPanel(new GridLayout(4, 3));

        for (int i = 1; i <= 9; i++) {
            p1.add(new JButton(" " + i));
        }

        p1.add(new JButton(" " + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        add(new JButton("Food to be placed here"), BorderLayout.CENTER);
        add(p2, BorderLayout.EAST);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Microwave mic = new Microwave();
        mic.setTitle("The Front View of a Microwave Oven");
        mic.pack();
        mic.setResizable(false);
        mic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mic.setLocationRelativeTo(null);
        mic.setVisible(true);
    }

}
