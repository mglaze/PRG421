//Pizza.java
//Rosa Williams
//Requirements:
//This assignment should be an application that calculates the price of a pizza.
//The application should contain a combobox allowing the user to select a small, medium,
//or large pizza costing five dollars, ten dollars or twenty dollars respectively.  In addition,
//the application should contain checkboxes allowing the user a choice of five toppings for the pizza.
//Each topping selected should add a dollar to the price of the pizza.  There should be a
//JButton marked "Total" that will cause the total cost of the pizza to be displayed.


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pizza extends JFrame implements ActionListener{//Start Class Pizza

     String[] pizzaList = { "Small $5", "Medium $10", "Large $20" };
     JComboBox comboBox = new JComboBox<String>(pizzaList);
     JButton pushButton = new JButton ("Get Total");

     JCheckBox cb1 =  new JCheckBox("Roast Beef");
     JCheckBox cb2 =  new JCheckBox("Anchovies");
     JCheckBox cb3 =  new JCheckBox("Onions");
     JCheckBox cb4 =  new JCheckBox("Mushrooms");
     JCheckBox cb5 =  new JCheckBox("Pepperoni");

    public static void main(String[] args) {//Start main
        JFrame frame = new Pizza();
    }// End main

    //constructor
    public Pizza() {//Start Constructor
        //Create GUI
        JPanel content = new JPanel();
        content.setLayout(new GridLayout(8, 2));  // Use simple GridLayout
        content.add(new JLabel("Choose a Pizza"));  // Create and add combobox label
        content.add(comboBox);                   // Add combobox field
        content.add(cb1);
        content.add(cb2);
        content.add(cb3);
        content.add(cb4);
        content.add(cb5);
        content.add(new JLabel(" ")); //Just a blank label for spacing
        content.add(new JLabel("See Your Total"));  // Create and add input label
        content.add(pushButton);                   // Add push button

        add(content);

        setLocationRelativeTo(null);
        pack();
        setTitle("Ordering a Pizza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

      //Add a listener for the button
 	     pushButton.addActionListener(this);

 }//End constructor

 //ActionListener for PushButton

	 public void actionPerformed(ActionEvent e) {
		int totalPrice = 0;

		//Determine basic price of pizsa
		if (comboBox.getSelectedItem().equals("Small $5"))
		   totalPrice = 5;
		else if (comboBox.getSelectedItem().equals("Medium $10"))
		   totalPrice = 10;
		else if (comboBox.getSelectedItem().equals("Large $20"))
		   totalPrice = 20;

		//Add a dollar for each topping selected
		if (cb1.isSelected())
			totalPrice++;

		if (cb2.isSelected())
			totalPrice++;

		if (cb3.isSelected())
			totalPrice++;

		if (cb4.isSelected())
			totalPrice++;

		if (cb5.isSelected())
			totalPrice++;


	   JOptionPane.showMessageDialog(null,
				"Your total is: $"+totalPrice);

	}//End actionPerformed method

}//End Class Pizza
