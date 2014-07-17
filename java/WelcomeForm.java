import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class WelcomeForm extends JFrame {
	private JButton[] button;

	public WelcomeForm(String title) {
		super(title);
		
		setLayout(new BorderLayout());

		button = new JButton[5];
		button[0] = new JButton("North Button");
		button[1] = new JButton("East Button");
		button[2] = new JButton("West Button");
		button[3] = new JButton("South Button");
		button[4] = new JButton("Center Button");

		add(button[0], BorderLayout.NORTH);
		add(button[1], "East");
		add(button[2], "West");
		add(button[3], "South");
		add(button[4], "Center");
	}
}