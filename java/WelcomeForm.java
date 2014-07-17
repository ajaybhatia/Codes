import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class WelcomeForm extends JFrame {
	private JButton[] button;

	public WelcomeForm(String title) {
		super(title);
		
		setLayout(new GridLayout(3, 3));

		button = new JButton[9];
		for (int i = 0; i < 9; i++) {
			button[i] = new JButton("Button " + i);
			add(button[i]);
		}
	}
}