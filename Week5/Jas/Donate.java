import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;


/**
	Learning Team A
	Ms. Rosa Williams
	PRG421 - Java Programming II
	Jan. 2014

	This program will take in information
	from users who are looking to
	donate to thier favorite charity.

	The form will allow user to enter info
	and select thier Charity from a drop-down
	menu.

	After hitting submit, the information entered
	should display on the TextArea field.

	At a minimum, the name field should not be 
	blank and the amount field should be numeric.
**/

public class Donate extends JFrame implements ActionListener
{
	//Background Image
	JLabel background=new JLabel(new ImageIcon("xmas.png"));

	//Define Panels
	JPanel mainPanel = new JPanel();
	JPanel donorPanel = new JPanel();
	JPanel textPanel = new JPanel();
	JPanel buttonPanel = new JPanel();

	//Define TextFields and TextArea
	JTextField myNameField = new JTextField();
	JTextField myAddressField = new JTextField();
	JTextField myPhoneField = new JTextField(11);
	JTextField donationAmountField = new JTextField();
	JTextField emailAddressField = new JTextField();
	JTextArea textArea = new JTextArea("Your Donation Details", 3,30);
	JScrollPane myScrollPane = new JScrollPane(textArea);
	int donationAmount;
	String phoneNumber;

	//Define buttons for submit and clear
	JButton submitButton = new JButton("SUBMIT");
	JButton clearButton = new JButton("CLEAR");

	//Define comboBox for list of Charities.
	String[] charityList = { "", " Red Cross", " UnitedWay", " UNICEF", " Salvation Army", " Habitat For Humanity"};
	JComboBox comboBox = new JComboBox<String>(charityList);

	Donate()
	{

		mainPanel.setLayout(new BorderLayout()); //Layout for frame

		//CONFIG DONOR PANEL
		donorPanel.setLayout(new GridLayout(6, 1));
		
		donorPanel.add(new JLabel ("Full Name: "));
		donorPanel.add(myNameField);
		myNameField.addActionListener(this);

		donorPanel.add(new JLabel ("Address: "));
		donorPanel.add(myAddressField);
		donorPanel.add(new JLabel ("Phone Number: "));
		donorPanel.add(myPhoneField);
		myPhoneField.addActionListener(this);

		donorPanel.add(new JLabel ("Select Your Charity: "));
		donorPanel.add(comboBox);
		donorPanel.add(new JLabel ("Enter Donation Amount: "));
		donorPanel.add(donationAmountField);
		donorPanel.add(new JLabel ("Email Address: "));
		donorPanel.add(emailAddressField);
		mainPanel.add(donorPanel, BorderLayout.WEST); //Add donorPanel to the mainPanel

		//CONFIGURE TEXT PANEL
		textPanel.setLayout(new BorderLayout());
		textArea.setEditable(false);
		textPanel.add(textArea); // add text area to textPanel
		mainPanel.add(textPanel, BorderLayout.EAST);
		myScrollPane.setVerticalScrollBarPolicy(
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		textArea.setEditable(false);

		//CONFIGURE BUTTON PANEL
		buttonPanel.setLayout(new GridLayout(1, 2));
		buttonPanel.add(submitButton);
		submitButton.addActionListener(this);
        buttonPanel.add(clearButton);
        clearButton.addActionListener(this);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH); //Add buttonPanel to the mainPanel

		add(mainPanel); //Add mainPanel to the frame
		mainPanel.add(background); //Add background image to mainPanel
	}
	public void actionPerformed(ActionEvent e) 
	{
		String donorName = myNameField.getText();
		String myAddress = myAddressField.getText(); //.......................Added myAddressField to get text
		String emailAddress= emailAddressField.getText(); //..................Added emailAddressField to get text

		if (e.getSource() == submitButton) //actions performed when submit button is pressed.
		{

			try
			{
				donationAmount = Integer.parseInt(donationAmountField.getText());
					
				

				if(donorName.length() == 0) //Name must be great than zero 
				{
					JOptionPane.showMessageDialog(null, "Please enter your name.");
				}

				if (myAddress.length() == 0) //....................To Assure Address Is Inputed
        		{
            		JOptionPane.showMessageDialog(null, "Make Sure You Type In An Address."); //............Stated That The Address Should Have Something
        		}//end if
     			if (emailAddress.length() == 0) //....................To Assure Email Is Inputed
		    	{
		    		JOptionPane.showMessageDialog(null, "Make Sure You Type In An Email."); //............Stated That The Email Should Have Something
        		}//end if
        		else
        		{
        			//textArea output goes here.
        			textArea.append("\n" + "\n" + " NAME: " + myNameField.getText()
					+ "\n" + " ADDRESS: " + myAddressField.getText()
					+ "\n" + " PHONE: " + myPhoneField.getText()
					+ "\n" + " EMAIL ADDRESS: " + emailAddressField.getText()
					+ "\n" + " CHARITY: " + comboBox.getSelectedItem()
					+ "\n" + " DONATION TOTAL: " + "$"+ donationAmountField.getText());
        		}
			}
			catch ( NumberFormatException ne)
			{
				JOptionPane.showMessageDialog(null, "Donation amount must be numeric.");
			}
			
		}
		if (e.getSource() == clearButton)
		{
			//process the clearButton
			myNameField.setText("");
			myAddressField.setText("");
			myPhoneField.setText("");
			donationAmountField.setText("");
			emailAddressField.setText("");
			textArea.setText("");
			comboBox.setSelectedIndex(0);
		}
		
  	} //end of actionPerformed

	public static void main(String[] args) {
		Donate frame = new Donate(); //Setting frame size and behavior
		frame.setTitle("'Tis the Season for Giving!");
    	frame.setSize(900, 300);
    	frame.setResizable(false);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
	}// end public static void

}// end Donate class
