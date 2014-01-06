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
	JTextField myPhoneField = new JTextField();
	JTextField donationAmountField = new JTextField();
	JTextField emailAddressField = new JTextField();
	JTextArea textArea = new JTextArea("Your Donation Details", 3,30);
	JScrollPane myScrollPane = new JScrollPane(textArea);

	//Define buttons for submit and clear
	JButton submitButton = new JButton("SUBMIT");
	JButton clearButton = new JButton("CLEAR");

	//Define comboBox for list of Charities.
	String[] charityList = { "", " Red Cross", " UnitedWay", " UNICEF", " Salvation Army", " Habitat For Humanity"};
	JComboBox comboBox = new JComboBox<String>(charityList);

	Donate(){

		mainPanel.setLayout(new BorderLayout()); //Layout for frame

		//CONFIG DONOR PANEL
		donorPanel.setLayout(new GridLayout(6, 1));
		donorPanel.add(new JLabel ("Full Name: "));
		donorPanel.add(myNameField);
		donorPanel.add(new JLabel ("Address: "));
		donorPanel.add(myAddressField);
		donorPanel.add(new JLabel ("Phone Number: "));
		donorPanel.add(myPhoneField);
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
		myScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
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
	public void actionPerformed(ActionEvent e) // the actionPerformed method
	{
		String donorName = myNameField.getText();
		String myAddress = myAddressField.getText(); //.......................Added myAddressField to get text
		String emailAddress= emailAddressField.getText(); //..................Added emailAddressField to get text
		boolean invalidNumber = false;

		/**************** INSTRUCTIONS FOR ADDING YOUR PORTIONS BELOW

			Add append actions for text fields and buttons below the first try.

			***See the example code starting on line 147:

			The example code checks for a donorName in the myNameField
			If the myNameField is empty an error will appear.

			To add your text to the text field you will use the "append"
			method. See Lines 74-76 in the "PizzaListPlus.java" file Ms.
			Rosa uploaded to guide you on how to write the exception.***

			~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

			***JOE***

			The myNameField is somewhat covered because I needed
			to write an example for everyone to follow. You will need
			to double check the myNameField and make sure the exception
			displays properly after everyone else adds exceptions. For
			example, no name the error should appear, "Please enter a name"
			attempting to add characters in a numeric field should return
			a different error.

			***JASPAL***

			Please enter the code to differentiate the actions for SUBMIT
			and CLEAR. Right now the code is listening for the submit
			action and then the form clears automatically.

			***SHANNON***

			For the phone number field you can try restricting
			the myPhoneField to 10 digits and then write the exception
			to only allow 10 digits below. See Lines 56-58 in the
			"PizzaListPlus.java" file Ms. Rosa uploaded to guide you on
			how to write the exception.

			***BRUCE***

			For the donation field you will need to restrict the
			donationAmountField to allow for numeric entries only. See
			Lines 56-58 in the "PizzaListPlus.java" file Ms. Rosa uploaded
			to guide you on how to write the exception.

			***JULIAN***

			If you'd like you can add an exception that checks
			for content in the address field.

		*****************/
		try
		{

		}

		catch (NumberFormatException ne)
		{
			invalidNumber = true;
		}
		if (donorName.length() == 0 || comboBox.getSelectedIndex() == 0 || invalidNumber)
		{
			JOptionPane.showMessageDialog(null, "Please Enter Your Name.");
  //The name must be greater than zero, a selection must be made from combobox and
        //number ordered must be valid

    if (myAddress.length() == 0 || comboBox.getSelectedIndex() == 0 || invalidNumber) //....................To Assure Address Is Inputed
        {
            JOptionPane.showMessageDialog(null, "Make Sure You Type In An Address."); //............Stated That The Address Should Have Something
        }//end if
     if (emailAddress.length() == 0 || comboBox.getSelectedIndex() == 0 || invalidNumber) //....................To Assure Email Is Inputed
		        {
		            JOptionPane.showMessageDialog(null, "Make Sure You Type In An Email."); //............Stated That The Email Should Have Something
        }//end if
		}
		else
		{
			textArea.append ("\n" + myNameField.getText() +
							 "\t" + myAddressField.getText() +  //.......................Append Address
							 "\t" + emailAddressField.getText() +  //.......................Append Email
							 "\t" + comboBox.getSelectedItem());
						myNameField.setText("");
						myAddressField.setText("");  //.......................Write Address
						emailAddressField.setText("");  //.......................Write Email
			comboBox.setSelectedIndex(0);
		}

		/* JASPAL
			Add actions for SUBMIT & CLEAR Buttons Here
		*/
		//Create actions for both buttons action.

	{
		if (e.getSource() == submitButton)

		//process the submitbutton (Write Jtextfields to textArea and clear fields
		textArea.append("\n" + myNameField.getText()
		+ "\n" + myAddressField.getText()
		+ "\n" + myPhoneField.getText()
		+ "\n" + comboBox.getSelectedItem()
		+ "\n" + donationAmountField.getText()
		+ "\n" + emailAddressField.getText());


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
}
	public static void main(String[] args) {
		//Setting frame size and behavior
		Donate frame = new Donate();
			frame.setTitle("'Tis the Season for Giving!");
    		frame.setSize(900, 300);
    		frame.setResizable(false);
    		frame.setLocationRelativeTo(null);
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setVisible(true);
	}

}
