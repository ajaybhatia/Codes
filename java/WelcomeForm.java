import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class WelcomeForm extends JFrame {
	private JButton[] button;

	public WelcomeForm(String title) {
		super(title);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));

		button = new JButton[50];
		for(int i = 0; i < 50; i++) {
			button[i] = new JButton("Button " + i); 
			add(button[i]);
		}
	}
}