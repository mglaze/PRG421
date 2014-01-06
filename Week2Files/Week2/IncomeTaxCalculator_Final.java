/* Michaela Glaze
Week 3 Individual Assignment
PRG/421
12/10/13
University of Phoenix
Rosa Williams
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class IncomeTaxCalculator extends JFrame implements ActionListener
{
	JTextField grossPayField, deductionsField, incomeTaxField;
	JButton calcButton;
    JButton clearButton;

	public IncomeTaxCalculator()
	{
		// Display title of Program
		setTitle("Michaela's Income Tax Calculator");

		// Close frame on click
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creates JTextField for grossPay
		JLabel grossPayLabel = new JLabel("Enter your Annual Gross Pay: ");
		grossPayField = new JTextField(20);
		add(grossPayLabel);
		add(grossPayField);

		// Creates JTextField for annual deductions
		JLabel deductionsLabel = new JLabel("Enter your total annual deductions: ");
		deductionsField = new JTextField(20);
		add(deductionsLabel);
		add(deductionsField);

		// Display's users Total Income Tax.
		JLabel incomeTaxLabel = new JLabel("Total Income Tax Due: ");
		incomeTaxField = new JTextField(20);
		incomeTaxField.setEditable(false);
		incomeTaxField.setHorizontalAlignment(JTextField.RIGHT); 
		add(incomeTaxLabel);
                add(incomeTaxField);

		// Create the calculate button
	    calcButton = new JButton("Calculate");
	    calcButton.addActionListener(this);
		add(calcButton);
                
        // Create clear button
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
		IncomeTaxCalculator sgp = new IncomeTaxCalculator();
	}// end Main


	
    /*If-Else Statement is for calculating net pay less than $10K.
      First, You have to calculate the netpay by subtracting deductions
      from gross pay for your If-Else statement.
    */

	public void actionPerformed(ActionEvent e)
	{
            if(e.getSource() == calcButton)
            {
                    double grossPay, deductions, netPay, incomeTax;
                    double taxRate = 0.25; //added taxrate
                    DecimalFormat dollar = new DecimalFormat("#,##0.00");
                    grossPay = Double.parseDouble(grossPayField.getText());
                    deductions = Double.parseDouble(deductionsField.getText());

           	 		netPay = grossPay - deductions;

                if (netPay > 10000)
                    {	
                        incomeTax = (netPay * taxRate);
                        netPay += incomeTax;     
                    }
                else
                    {
                    	incomeTax = 0;

                    }

                    incomeTaxField.setText("$" + dollar.format(incomeTax));
            }
           else
            {
                if(e.getSource() == clearButton) 
                {
                    grossPayField.setText("");
                    deductionsField.setText("");
                    incomeTaxField.setText("");
                }
            }
	}
}//end Class