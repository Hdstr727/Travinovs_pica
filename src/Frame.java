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

		
		
		//Pizza types
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
		
		//Toppings
		JLabel l2 = new JLabel();
		l2.setBounds(270,20,90,30);
		l2.setText("Topping:");
		JRadioButton r5 = new JRadioButton("Mushrooms");
		r5.setBounds(260,80,95,20);
		JRadioButton r6 = new JRadioButton("Extra cheese");
		r6.setBounds(260,140,100,20);
		JRadioButton r7 = new JRadioButton("Tomatoes");
		r7.setBounds(260,200,95,20);
		JRadioButton r8 = new JRadioButton("Pickles");
		r8.setBounds(260,260,95,20);
		frame.add(l2); frame.add(r5);frame.add(r6);frame.add(r7);frame.add(r8);
		
		
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.revalidate();
		frame.repaint();
	}
}
