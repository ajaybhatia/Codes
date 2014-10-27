import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FontFace extends JFrame implements ActionListener {
	JComboBox font, fontStyle, fontSize;
	JButton ok;
	JLabel lbl;
	String[] fontFamily;
	JPanel p1, p2, p3;
		
	FontFace(String title) {
		super(title);
		
		GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontFamily = g.getAvailableFontFamilyNames(); 
		
		font = new JComboBox();
		for(int i = 0; i < fontFamily.length; i++)
			font.addItem(fontFamily[i]);
		
		fontStyle = new JComboBox();
		fontStyle.addItem("PLAIN");
		fontStyle.addItem("BOLD");
		fontStyle.addItem("ITALIC");
		
		fontSize = new JComboBox();
		for(int i = 5; i <= 72; i++)
			fontSize.addItem(i);
			
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(font);
		p1.add(fontStyle);
		p1.add(fontSize);	
		
		ok = new JButton("Press Me", new ImageIcon("hp.gif"));
		
		p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.add(ok);
		
		lbl = new JLabel("");
		
		p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		p3.add(lbl);
		
		setLayout(new GridLayout(3, 1));
		add(p1);
		add(p2);
		add(p3);
		
		ok.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ok) {
			String fontName = font.getSelectedItem().toString();
			
			int fStyle = 0;
			if(fontStyle.getSelectedItem().toString().equals("PLAIN"))
				fStyle = Font.PLAIN;
			else if(fontStyle.getSelectedItem().toString().equals("BOLD"))		
				fStyle = Font.BOLD;
			else if(fontStyle.getSelectedItem().toString().equals("ITALIC"))
				fStyle = Font.ITALIC;
									
			int fSize = Integer.parseInt(fontSize.getSelectedItem().toString());
			
			lbl.setFont(new Font(fontName, fStyle, fSize));
			lbl.setText("You selected " + font.getSelectedItem().toString());	
		} 
	}
}

public class FontDemo {
	public static void main(String args[]) throws Exception {
		FontFace frm = new FontFace("Font Demo");
		frm.setSize(800, 400);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
