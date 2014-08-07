import javax.swing.JOptionPane;

public class TotalCost {
	public static void main(String[] args) {
		// Input
		float price = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the price of the product", "100"));	

		// Ouput
		JOptionPane.showMessageDialog(null, "Total price of the product is " + (price + (0.06f * price)));
	}
}
