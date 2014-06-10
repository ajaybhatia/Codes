import javax.swing.JOptionPane;

public class SumGUI {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number?", "0"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number?", "0"));

		JOptionPane.showMessageDialog(null, "Sum of " + num1 + " and " + num2 + " is " + (num1 + num2), "Welcome Message", JOptionPane.PLAIN_MESSAGE);
	}
}
