import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.text.DecimalFormat;


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

	//Define TextFields and TextArea
	JTextArea textArea = new JTextArea();
	JTextField myNameField, myAddressField, myPhoneField, donationAmountField, emailAddressField;
	JScrollPane myScrollPane = new JScrollPane(textArea);

	//Define buttons for submit and clear
	JButton submitButton = new JButton("SUBMIT");
	JButton clearButton = new JButton("CLEAR");

	//Define comboBox for list of Charities.
	String[] charityList = { "Select a Charity", " Charity1", " Charity2", " Charity3", " Charity4", " Charity5"};
	JComboBox comboBox = new JComboBox<String>(charityList);

	public Donate()
	{
	// Define mainPanel in the frame
		JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new BorderLayout());

	//Define buttonPanel in the mainPanel
		JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new GridLayout(1, 2));

		//Add submitButton to the buttonPanel and listen to actionsperformed
			submitButton.addActionListener(this);
				buttonPanel.add(submitButton);

		//Add clearButton to the buttonPanel and listen to actionsperformed
			clearButton.addActionListener(this);
                buttonPanel.add(clearButton);

        //Add buttonPanel to the mainPanel
			mainPanel.add(buttonPanel, BorderLayout.SOUTH);

	// Define donorPanel in the mainPanel

		JPanel donorPanel = new JPanel();

			//Define donorPanel layout
			donorPanel.setLayout(new GridLayout(6, 1));

			// Define donorPanel TextFields
			myNameField = new JTextField("Enter Your Name");
			myAddressField = new JTextField("Enter Your Address");
			myPhoneField = new JTextField("Enter Your Phone #");

			donationAmountField = new JTextField(" ");
			emailAddressField = new JTextField("Enter Your Email Address");

			//Add donorPanel TextFields and ComboBox to the mainPanel
			donorPanel.add(new JLabel ("Full Name: "));
			donorPanel.add(myNameField);
			donorPanel.add(new JLabel ("Address: "));
			donorPanel.add(myAddressField);
			donorPanel.add(new JLabel ("Phone Number: "));
			donorPanel.add(myPhoneField);
			donorPanel.add(new JLabel ("Select Your Charity: "));
			donorPanel.add(comboBox);
			donorPanel.add(new JLabel ("Enter Donation Amount: $ "));
			donorPanel.add(donationAmountField);
			donorPanel.add(new JLabel ("Email Address: "));
			donorPanel.add(emailAddressField);

			//Add donorPanel to the mainPanel
			mainPanel.add(donorPanel, BorderLayout.WEST);

	//Define textPanel in the mainPanel
		JPanel textPanel = new JPanel();
			textPanel.setLayout(new BorderLayout());
			textArea = new JTextArea(6, 15);
			textPanel.add(textArea);
			mainPanel.add(textPanel, BorderLayout.EAST);

			myScrollPane.setVerticalScrollBarPolicy(
                   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
   			textArea.setEditable(false);

		add(mainPanel); //Add mainPanel to the frame
		mainPanel.add(background); //Add background image to mainPanel
	}
	public void actionPerformed(ActionEvent e)
	 {     // the actionPerformed method

	        double donationAmount = 0;
	        boolean invalidNumber = false;  //Assume number is not invalid

		    //Format for donation amount
			DecimalFormat dollar = new DecimalFormat("#,##0.00");

	        try
	        {
	               donationAmount = Double.parseDouble(donationAmountField.getText());
	        } //end try
	        // process improperly formatted input
	        catch ( NumberFormatException ne )
		     {
	              invalidNumber = true;  //The number was invalid
	         } //end catch

	        //The name must be greater than zero, a selection must be made from combobox and
	        //number ordered must be valid
	        if (invalidNumber)
	        {
	            JOptionPane.showMessageDialog(null, "Please complete your order.");
	        }//end if
	        else
	        {
			//Write order to textarea and clear fields
	            textArea.append("$" + dollar.format(donationAmount));
	            donationAmountField.setText("");

	        }//end else
	    }//end actionPerformed



	public static void main(String[] args)
	 {
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
