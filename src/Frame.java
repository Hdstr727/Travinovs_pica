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
		
		
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.revalidate();
		frame.repaint();
	}
}
