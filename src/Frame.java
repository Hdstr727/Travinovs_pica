import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Frame {
	public void CreateFrame() {
		JFrame frame = new JFrame("Pizza");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);

		JLabel l1 = new JLabel();
		l1.setBounds(100,20,90,30);  
		l1.setText("Types of Pizza:");
		JRadioButton r1 = new JRadioButton("Peperoni");
		r1.setBounds(100,80,80,20);
		JRadioButton r2 = new JRadioButton("Sicilian");
		r2.setBounds(100,140,80,20);
		JRadioButton r3 = new JRadioButton("Chicago");
		r3.setBounds(100,200,80,20);
		JRadioButton r4 = new JRadioButton("Hawaiian");
		r4.setBounds(100,260,80,20);
		
		frame.add(l1); frame.add(r1); frame.add(r2); frame.add(r3); frame.add(r4);
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.revalidate();
		frame.repaint();
	}
}
