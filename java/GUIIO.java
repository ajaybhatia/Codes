import javax.swing.JOptionPane;

public class GUIIO {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "Enter first number", "0");
		String b = JOptionPane.showInputDialog(null, "Enter second number", "0");

		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);

		JOptionPane.showMessageDialog(null, "Sum of " + x + " and " + y + " is " + (x + y));
	}
}
