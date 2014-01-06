//FundRaiser.java -- This program inputs personal information and dollar amount of the donation from the donor. The information is then displayed in a JTextArea 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.awt.FlowLayout;

public class FundRaiser extends JFrame implements ActionListener
{
	JTextField NameField, SelectorBoxField, addressField, cityField, zipField, MoneyField, PhoneField, EmailField;
	JButton SubmitButton, ClearButton;
	public FundRaiser()
String[] states = {"---"}
	
// Set the frame title
	setTitle ("Children’s Christmas Stocking Fundraiser");

// Specify what happens when the close button is clicked.
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Create the donor Name.
		JLabel NameLabel = new JLabel("Enter First and Last name: ");
		NameField = new JTextField(30);
		add(NameLabel);
		add(NameField);
Error code = cannot be left blank
// Create the Charity selector box.
		JLabel SelectorBoxLabel = new JLabel("Select Charity: ");
		The user selects SelectorBoxCharityName from a list of options display.

		add(SelectorBoxLabel);
		add(SelectorBoxField);

// Create the Address.
JLabel addressLabel = new JLabel("Address: ");
		addressField = new JTextField(50);
		add(addressLabel);
		add(addressField);

		JLabel cityLabel = new JLabel("City: ");
		cityField = new JTextField(10);
		add(cityLabel);
		add(cityField);

		JLabel stateLabel = new JLabel("State:");
		JComboBox<String> stte = new JComboBox<>(states);
		add(stateLabel);
		add(Box.createHorizontalStrut(10));
		stateLabel.setLabelFor(stte);
    		add(stte);

		JLabel zipLabel = new JLabel("Zip: ");
		zipField = new JTextField(10);
		add(zipLabel);
		add(zipField);

// Create the donation Dollar Amount.
		JLabel DonationLabel = new JLabel("Amount of donation: ");
		DonationField = new JTextField(10);
		DonationField.setHorizontalAlignment(JTextField.RIGHT);
		add(DonationLabel);
	    	add(DonationField);
Error code = numeric only
// Create the Phone number.
		JLabel PhoneLabel = new JLabel("Enter Phone #: ");
		PhoneField = new JTextField(10);
		add(PhoneLabel);
		add(PhoneField);
Error code = 10 digits only, no more no less
// Create the Email address.
		JLabel EmailLabel = new JLabel("Enter Email Address: ");
		EmailField = new JTextField(30);
		add(EmailLabel);
		add(EmailField);
	
// Create the submit and clear button.
SubmitButton = new JButton("Submit");
SubmitButton.addActionListener(this);
add(SubmitButton);
clearButton = new JButton("Clear");
clearButton.addActionListener(this);
	add(clearButton);
// Set FlowLayout, aligned left with horizontal gap 10
    // and vertical gap 20 between components
    setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		setVisible(true);
// end constructor
	public static void main(String[] args)
ShowFlowLayout frame = new ShowFlowLayout();
    	frame.setTitle("ShowFlowLayout");
    	frame.setSize(800, 800);
    	frame.setLocationRelativeTo(null); // Center the frame		

// end Main

//Create the Submit and Clear button actions.
	public void actionPerformed(ActionEvent e)
		if (e.getSource() == SubmitButton)
//process the SubmitButton
	When donor presses the Submit button, the entered information will be displayed in a JTextArea on the template

//Format for donated $$ amount
		DecimalFormat dollar = new DecimalFormat("#,##0.00");

if (e.getSource() == clearButton)			
//process the clearButton
		NameField.setText("");
		CharityField.setText("");
		AddressField.setText("");
		DonationField.setText("");
		PhoneField.setText("");
		EmailField.setText("");
	
//end Class
