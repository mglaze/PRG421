//SwingGrossPay.java -- This program calculates gross pay by multiplying rate times hours
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class SwingGrossPay extends JFrame implements ActionListener
{
	JTextField hoursField, payRateField, grossPayField, overtimePay;
	JButton calcButton;
        JButton clearButton;

	public SwingGrossPay()
	{
		// Set the frame title
		setTitle("Swing Gross Pay");

		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create the hours.
		JLabel hoursLabel = new JLabel("Enter the number of hours worked: ");
		hoursField = new JTextField(10);
		add(hoursLabel);
		add(hoursField);

		// Create the pay rate.
		JLabel payRateLabel = new JLabel("Enter your hourly pay rate: ");
		payRateField = new JTextField(10);
		//payRateField.setHorizontalAlignment(JTextField.RIGHT);
		add(payRateLabel);
		add(payRateField);

		// Create the gross pay.
		JLabel grossPayLabel = new JLabel("Gross pay: ");
		grossPayField = new JTextField(10);
		grossPayField.setEditable(false); //Makes field read only
		grossPayField.setHorizontalAlignment(JTextField.RIGHT);
		add(grossPayLabel);
	    add(grossPayField);

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


	//Create the button's action.
	public void actionPerformed(ActionEvent e)
	{
            if(e.getSource() == calcButton) 
            {
                    double grossPay, hours, payRate;
                    DecimalFormat dollar = new DecimalFormat("#,##0.00");
                    double overtimePay;
                    hours = Double.parseDouble(hoursField.getText());
                    payRate = Double.parseDouble(payRateField.getText());
           
                if (hours > 40)
                    {
                        grossPay = 40 * payRate;
                        overtimePay = (hours - 40) * (payRate * 1.5);
                        grossPay += overtimePay;
                    }
                else
                    {
                // No Overtime Worked
                    grossPay = (payRate * hours);
                    }
                    grossPayField.setText("$" + dollar.format(grossPay));
            }
            else
            {
                if(e.getSource() == clearButton) 
                {
                    hoursField.setText("");
                    payRateField.setText("");
                    grossPayField.setText("");
                }
            }
	}
}//end Class