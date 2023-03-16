import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame implements ActionListener {

	//Pizza types
	JFrame frame = new JFrame("Pizza");
	JLabel l1 = new JLabel("Types of Pizza:");
	JRadioButton r1 = new JRadioButton("Peperoni");
	JRadioButton r2 = new JRadioButton("Sicilian");
	JRadioButton r3 = new JRadioButton("Chicago");
	JRadioButton r4 = new JRadioButton("Hawaiian");
	ButtonGroup pizzaGroup = new ButtonGroup();

	//Toppings
	JLabel l2 = new JLabel("Topping:");
	JCheckBox checkbox1 = new JCheckBox("Mushrooms");
	JCheckBox checkbox2 = new JCheckBox("Extra cheese");
	JCheckBox checkbox3 = new JCheckBox("Tomatoes");
	JCheckBox checkbox4 = new JCheckBox("Pickles");

	//Size
	JLabel l3 = new JLabel("Size:");
	JRadioButton r5 = new JRadioButton("Small(25cm)- 8 EUR");
	JRadioButton r6 = new JRadioButton("Medium(35cm) - 12 EUR");
	JRadioButton r7 = new JRadioButton("Large(50cm) - 15 EUR");
	ButtonGroup sizeGroup = new ButtonGroup();

	//Number of pizzas
	JLabel l4 = new JLabel("Quantity:");
	TextField t1 = new TextField("");
	JButton b1 = new JButton("OK");
	JButton b2 = new JButton("CLEAR");

	//Total price
	JLabel l5 = new JLabel("Total price:");
	TextField t2 = new TextField("");


	//Pay
	JButton b3 = new JButton("Pay");

	public void CreateFrame() {
		//JFrame frame = new JFrame("Pizza");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Pizza types
		l1.setBounds(50, 20, 90, 30);
		r1.setBounds(50, 60, 80, 20);
		r2.setBounds(50, 100, 80, 20);
		r3.setBounds(50, 140, 80, 20);
		r4.setBounds(50, 180, 80, 20);
		pizzaGroup.add(r1);
		pizzaGroup.add(r2);
		pizzaGroup.add(r3);
		pizzaGroup.add(r4);
		frame.add(l1);
		frame.add(r1);
		frame.add(r2);
		frame.add(r3);
		frame.add(r4);

		//Toppings
		l2.setBounds(180, 20, 90, 30);
		checkbox1.setBounds(180, 60, 95, 20);
		checkbox2.setBounds(180, 100, 100, 20);
		checkbox3.setBounds(180, 140, 95, 20);
		checkbox4.setBounds(180, 180, 95, 20);
		frame.add(l2);
		frame.add(checkbox1);
		frame.add(checkbox2);
		frame.add(checkbox3);
		frame.add(checkbox4);

		//Size
		l3.setBounds(310, 20, 90, 30);
		r5.setBounds(310, 60, 150, 30);
		r6.setBounds(310, 100, 170, 30);
		r7.setBounds(310, 140, 150, 30);
		sizeGroup.add(r5);
		sizeGroup.add(r6);
		sizeGroup.add(r7);
		frame.add(r5);
		frame.add(r6);
		frame.add(r7);
		frame.add(l3);

		//Number of pizzas
		l4.setBounds(500, 20, 60, 30);
		t1.setBounds(565, 24, 72, 24);
		b1.setBounds(500, 60, 60, 30);
		b2.setBounds(565, 60, 75, 30);
		frame.add(l4);
		frame.add(t1);
		frame.add(b1);
		frame.add(b2);

		//Total price
		l5.setBounds(500, 100, 70, 30);
		t2.setBounds(567, 104, 72, 24);
		frame.add(l5);
		frame.add(t2);

		//Pay
		b3.setBounds(545, 140, 60, 30);
		frame.add(b3);

		frame.setSize(680, 270);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.revalidate();
		frame.repaint();

		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		r5.addActionListener(this);
		r6.addActionListener(this);
		r7.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	int size = 0;
	String selectedPizza = "";
	int numberOfPizzas = 0;
	boolean mushrooms = false;
	boolean cheese = false;
	boolean tomato = false;
	boolean pickle = false;

	@Override
	public void actionPerformed(ActionEvent e) {
		//Pizza types

		if (e.getSource() == r1)
			selectedPizza = "Peperoni";
		 else if (e.getSource() == r2)
			selectedPizza = "Sicilian";
		 else if (e.getSource() == r3)
			selectedPizza = "Chicago";
		 else if (e.getSource() == r4)
			selectedPizza = "Hawaiian";


		//Pizza toppings
		int mushPrice = 0;
		int cheesePrice = 0;
		int tomatoPrice = 0;
		int picklePrice = 0;
		

		if (checkbox1.isSelected()) {
			mushrooms = true;
			mushPrice = 1;
			System.out.println("Mushrooms: " + mushPrice);
		} else {
			mushrooms = false;
			mushPrice = 0;
			System.out.println("Mushrooms: " + mushPrice);
		}

		if (checkbox2.isSelected()) {
			cheese = true;
			cheesePrice = 1;
			System.out.println("Cheese: " + cheesePrice);
		} else {
			cheese = false;
			cheesePrice = 0;
			System.out.println("Cheese: " + cheesePrice);
		}

		if (checkbox3.isSelected()) {
			tomato = true;
			tomatoPrice = 1;
			System.out.println("Tomatoes: " + tomatoPrice);
		} else {
			tomato = false;
			tomatoPrice = 0;
			System.out.println("Tomatoes: " + tomatoPrice);
		}

		if (checkbox4.isSelected()) {
			pickle = true;
			picklePrice = 1;
			System.out.println("Pickles: " + picklePrice);
		} else {
			pickle = false;
			picklePrice = 0;
			System.out.println("Pickles: " + picklePrice);
		}

		//Size

		if (e.getSource() == r5) {
			size = 25;
			System.out.println("Size is set to "+size);
		}
		else if (e.getSource() == r6) {
			size = 35;
			System.out.println("Size is set to "+size);
		}
		else if (e.getSource() == r7) {
			size = 50;
			System.out.println("Size is set to "+size);
		}

		int price = 0;
		Pizza newPizza;
		//Number of pizzas
		if (e.getSource() == b1) {
			numberOfPizzas = Integer.parseInt(t1.getText());
			//if (size!=0 && !selectedPizza.equals("") && numberOfPizzas != 0) {
				newPizza = new Pizza(size, selectedPizza, mushrooms, cheese, tomato, pickle);
				System.out.println("Created a new pizza object");
				if (size == 25) {
					price = numberOfPizzas * (8 + mushPrice + cheesePrice + tomatoPrice + picklePrice);

				}
				else if (size == 35) {
					price = numberOfPizzas * (12 + mushPrice + cheesePrice + tomatoPrice + picklePrice);
				}
				else if (size == 50) {
					price = numberOfPizzas * (15 + mushPrice + cheesePrice + tomatoPrice + picklePrice);
				}

				String priceStr = Integer.toString(price);
				System.out.println("Price: "+price);
				t2.setText(priceStr+" EUR");
				t2.revalidate();
				t2.repaint();
				
				System.out.println("PriceStr: "+priceStr);
		}
		if (e.getSource() == b2) {
			t1.setText("");
			t2.setText("");
			t1.revalidate();
			t1.repaint();
			t2.revalidate();
			t2.repaint();
			pizzaGroup.clearSelection();
			sizeGroup.clearSelection();
			r1.revalidate();
			r1.repaint();
			r2.revalidate();
			r2.repaint();
			r3.revalidate();
			r3.repaint();
			r4.revalidate();
			r4.repaint();
			r5.revalidate();
			r5.repaint();
			r6.revalidate();
			r6.repaint();
			r7.revalidate();
			r7.repaint();
			checkbox1.setSelected(false);
			checkbox1.revalidate();
			checkbox1.repaint();
			checkbox2.setSelected(false);
			checkbox2.revalidate();
			checkbox2.repaint();
			checkbox3.setSelected(false);
			checkbox3.revalidate();
			checkbox3.repaint();
			checkbox4.setSelected(false);
			checkbox4.revalidate();
			checkbox4.repaint();
			
		}
	}
}