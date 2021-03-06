import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Donations extends JFrame implements ActionListener 
{
	//Background Image
	JLabel background=new JLabel(new ImageIcon("background.jpg"));

	//Panels in the Frame
	JPanel mainPanel = new JPanel(); // Main Panel
	JPanel buttonPanel = new JPanel(); // Button Panel
	JPanel donorPanel = new JPanel(); // Panel for Donor Info
	
	//Donor Information
	JTextField myName = new JTextField("Enter Your First and Last Name");
 	JTextField myAddress = new JTextField("Enter Your Address");
 	JTextField myPhone = new JTextField("Enter Your Phone#");
 	JTextField donationAmount = new JTextField("Enter Donation Amount");
 	JTextField emailAddress = new JTextField("Enter Email Address");

 	//Submitted Information
 	JTextArea myTextArea = new JTextArea("this is a text area. which is changing",6,30);

 	//Submit Donor Information
 	JButton submit = new JButton("SUBMIT");   // create button
 	JButton clear = new JButton("CLEAR");   // create button
	
	//Charity ComboBox
	String[] charityList = { "Charity1", "Charity2", "Charity3", "Charity4, Charity5" };
 	JComboBox comboBox = new JComboBox<String>(charityList);

	public Donations (){
		super("'Tis the Season for Giving!");
		submit.addActionListener(this);
		
		//Main Panel Content
		add(mainPanel);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(myTextArea,BorderLayout.EAST);    // add text area
   		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
   		mainPanel.add(donorPanel, BorderLayout.WEST);

   		//Button Panel Content
   		buttonPanel.setLayout(new GridLayout(2, 1, 1, 1));
   		buttonPanel.add(submit);                // add button
   		buttonPanel.add(clear);                // add button
		
		//Donor Panel Content
		donorPanel.setLayout(new GridLayout(6, 0, 1, 1));
		donorPanel.add(myName);
		donorPanel.add(myAddress);
		donorPanel.add(myPhone);
		donorPanel.add(comboBox);
		donorPanel.add(donationAmount);
		donorPanel.add(emailAddress);
		
		//add(mainPanel);
		mainPanel.add(background);
		setDefaultCloseOperation(Donations.EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		Donations frame = new Donations();
		//frame.setContentPane(new JLabel(new ImageIcon("background.jpg")));
		frame.setSize(1000,500);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(Donations.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){ // the actionPerformed method
  	}
	
}