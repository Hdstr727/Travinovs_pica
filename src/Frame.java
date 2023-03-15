import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Frame {
	public void CreateFrame() {
		JFrame frame = new JFrame("Pizza");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		
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
		JCheckBox checkbox1 = new JCheckBox("Mushrooms");
		checkbox1.setBounds(260,80,95,20);
		JCheckBox checkbox2 = new JCheckBox("Extra cheese");
		checkbox2.setBounds(260,140,100,20);
		JCheckBox checkbox3 = new JCheckBox("Tomatoes");
        checkbox3.setBounds(260,200,95,20);
		JCheckBox checkbox4 = new JCheckBox("Pickles");
		checkbox4.setBounds(260,260,95,20);
		frame.add(l2); frame.add(checkbox1);frame.add(checkbox2);frame.add(checkbox3);frame.add(checkbox4);
		
		//Size 
		JLabel l3 = new JLabel();
		l3.setBounds(410, 20, 90, 30);
		l3.setText("Size");
		JRadioButton r5 = new JRadioButton("Small - 8 EUR");
		r5.setBounds(390, 80, 110, 30);
		JRadioButton r6 = new JRadioButton("Medium - 12 EUR");
		r6.setBounds(390, 140, 130, 30);
		JRadioButton r7 = new JRadioButton("Large - 15 EUR");
		r7.setBounds(390, 200, 110, 30);
		frame.add(r5); frame.add(r6); frame.add(r7); frame.add(l3);
		
		
		
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.revalidate();
		frame.repaint();
	}
}
