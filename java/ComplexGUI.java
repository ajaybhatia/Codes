import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import maths.Complex;

public class ComplexGUI extends JFrame {
	private JLabel complex1Label;
	private JLabel complex2Label;
	private JTextField cp1RealText;
	private JTextField cp2RealText;
	private JTextField cp1ImgText;
	private JTextField cp2ImgText;
	private JButton addButton;
	private JButton prodButton;
	private JLabel resultLabel;

	public ComplexGUI() {
		complex1Label = new JLabel("Complex Number 1: ");
		complex2Label = new JLabel("Complex Number 2: ");
		cp1RealText = new JTextField();
		cp2RealText = new JTextField();
		cp1ImgText = new JTextField();
		cp2ImgText = new JTextField();
		addButton = new JButton("Add");
		prodButton = new JButton("Product");
		resultLabel = new JLabel();

		setLayout(new GridLayout(3, 1));

		JPanel complexPanel = new JPanel();
		complexPanel.setLayout(new GridLayout(2, 3));
		complexPanel.add(complex1Label);
		complexPanel.add(cp1RealText);
		complexPanel.add(cp1ImgText);
		complexPanel.add(complex2Label);
		complexPanel.add(cp2RealText);
		complexPanel.add(cp2ImgText);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(prodButton);
		buttonPanel.add(addButton);

		JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		resultPanel.add(resultLabel);

		add(complexPanel);
		add(buttonPanel);
		add(resultPanel);

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Complex c1 = new Complex(Double.parseDouble(cp1RealText.getText()), Double.parseDouble(cp1ImgText.getText()));
				Complex c2 = new Complex(Double.parseDouble(cp2RealText.getText()), Double.parseDouble(cp2ImgText.getText()));
				Complex result = c1.add(c2);

				resultLabel.setText(result.toString());
			}
		});

		prodButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Complex c1 = new Complex(Double.parseDouble(cp1RealText.getText()), Double.parseDouble(cp1ImgText.getText()));
				Complex c2 = new Complex(Double.parseDouble(cp2RealText.getText()), Double.parseDouble(cp2ImgText.getText()));
				Complex result = c1.prod(c2);

				resultLabel.setText(result.toString());
			}
		});
	}

	public static void main(String[] args) {
		ComplexGUI form = new ComplexGUI();
		form.setTitle("Complex Number Calculator");
		form.pack();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setVisible(true);
	}
}