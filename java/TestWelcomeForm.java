import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWelcomeForm {
	public static void main(String[] args) {
		WelcomeForm form = new WelcomeForm("My Form");
		form.setSize(500, 500);
		form.setVisible(true);

		form.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}	
}