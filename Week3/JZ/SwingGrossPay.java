/*
 * Joe Zera
 * Week 3 Assignment
 * PRG/421
 * 12/10/13
 * University of Phoenix
 * Ms. Rosa Williams
 * This program will calculate income tax.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class SwingGrossPay extends JFrame implements ActionListener
{
	JTextField grosspayField, totdeductField, incometaxField, overtimePay;
	JButton calcButton;
    JButton clearButton;

	public SwingGrossPay()
	{
		// This section displays the title of the program "Joe's Income Tax Program"
		setTitle("Joe's Income Tax Program");

		// Thi section specifies what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// This section creates a JTextField for the user to enter their Gross Pay.
		JLabel grosspayLabel = new JLabel("Enter your Gross Pay: ");
		grosspayField = new JTextField(20);
		add(grosspayLabel);
		add(grosspayField);

		// This section creates a JTextField for the user to enter their Total Deductions.
		JLabel totdeductLabel = new JLabel("Enter your total deductions: ");
		totdeductField = new JTextField(20);
		add(totdeductLabel);
		add(totdeductField);

		// This section displays the user's total Income Tax Due.
		JLabel incometaxLabel = new JLabel(" Total Income Tax Due: ");
		incometaxField = new JTextField(20);
		incometaxField.setEditable(false); //Makes field read only
		incometaxField.setHorizontalAlignment(JTextField.RIGHT); //Makes the filed Right justified.
		add(incometaxLabel);
                add(incometaxField);

		// Create the button.

	    calcButton = new JButton("Calculate");
	    calcButton.addActionListener(this);
		add(calcButton);
                
            clearButton = new JButton("Clear");
            clearButton.addActionListener(this);
                add(clearButton);
                
		setLayout(new GridLayout(4, 1));

		// Pack and display the frame.
		pack();
		setVisible(true);
	}// end constructor

	public static void main(String[] args)
	{
		SwingGrossPay sgp = new SwingGrossPay();
	}// end Main


//Michaela...from this part down, I'm having issues with my calculations are not working.  
//When I type in the numbers, all it displays is the Gross Pay.
//Any help would be greatly appreciated.

/*
To calculate the income tax, first subtract the deductions from the gross pay.  
This difference is the net pay.  
If the net pay is less than 10 thousand dollars, 
then the income tax due is zero.  
If the net pay is greater than or equal to 10 thousand dollars, 
then the tax due is twenty five percent of the net pay. 
*/
	//Create the button's action.
	public void actionPerformed(ActionEvent e)
	{
            if(e.getSource() == calcButton)
            {
                    double grosspay, totdeduct, netpay, incometax;
                    double taxRate = 0.25; //added taxrate
                    DecimalFormat dollar = new DecimalFormat("#,##0.00");
                    grosspay = Double.parseDouble(grosspayField.getText());
                    totdeduct = Double.parseDouble(totdeductField.getText());

           /*If-Else Statement is for calculating net pay less than $10K.
           	 First, You have to calculate the netpay by subtracting deductions
           	 from gross pay for your If-Else statement.
           */

           	 		netpay = grosspay - totdeduct;

                if (netpay > 10000)
                    {	
                        incometax = (netpay * taxRate);
                        netpay += incometax;     
                    }
                else //NetPay < 10000
                    {
                    	incometax = (grosspay - totdeduct);

                    }

                    incometaxField.setText("$" + dollar.format(incometax));
            }
           else
            {
                if(e.getSource() == clearButton) 
                {
                    grosspayField.setText("");
                    totdeductField.setText("");
                    incometaxField.setText("");
                }
            }
	}
}//end Class