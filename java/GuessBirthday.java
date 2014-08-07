import javax.swing.JOptionPane;

public class GuessBirthday {
	public static void main(String[] args) {
		int sum = 0;

		String table1 = " 1    3     5    7    9\n11  13  15  17  19\n21  23  25  27  29\n31";
		int op1 = JOptionPane.showConfirmDialog(null, table1, "Table 1", JOptionPane.YES_NO_OPTION);
		if (op1 == JOptionPane.YES_OPTION)
			sum += 1;

		String table2 = " 2    3     6    7    10\n11  14  15  18  19\n22  23  26  27  30\n31";
		int op2 = JOptionPane.showConfirmDialog(null, table2, "Table 2", JOptionPane.YES_NO_OPTION);
		if (op2 == JOptionPane.YES_OPTION)
			sum += 2;

		String table3 = " 4    5     6    7    12\n13  14  15  20  \n21  22  23  28  29\n30 31";
		int op3 = JOptionPane.showConfirmDialog(null, table3, "Table 3", JOptionPane.YES_NO_OPTION);
		if (op3 == JOptionPane.YES_OPTION)
			sum += 4;

		String table4 = " 8    9     10   11   12\n13  14  15  17  24\n25  26  27  28  29\n30 31";
		int op4 = JOptionPane.showConfirmDialog(null, table4, "Table 4", JOptionPane.YES_NO_OPTION);
		if (op4 == JOptionPane.YES_OPTION)
			sum += 8;

		String table5 = " 16  17  18  19  20\n21  22  23  24  25\n26  27  28  29  30\n31";
		int op5 = JOptionPane.showConfirmDialog(null, table5, "Table 5", JOptionPane.YES_NO_OPTION);
		if (op5 == JOptionPane.YES_OPTION)
			sum += 16;

		
		JOptionPane.showMessageDialog(null, "Your born on " + sum + " day of the month");
	}
}
