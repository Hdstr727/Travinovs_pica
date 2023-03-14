import javax.swing.JFrame;

public class Frame {
	public void CreateFrame() {
		JFrame frame = new JFrame("Pizza");
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
