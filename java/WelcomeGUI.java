import javax.swing.JOptionPane;

public class WelcomeGUI {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Enter you name?", "YOUR NAME");
		JOptionPane.showMessageDialog(null, "Welcome, " + name, "Welcome Message", JOptionPane.PLAIN_MESSAGE);
	}
}
