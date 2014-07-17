public class TestWelcomeForm {
	public static void main(String[] args) {
		WelcomeForm form = new WelcomeForm("My Form");
		form.pack();
		form.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		form.setVisible(true);
	}	
}