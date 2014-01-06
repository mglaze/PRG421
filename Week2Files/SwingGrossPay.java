//SwingGrossPay.java -- This program calculates gross pay by multiplying rate times hours
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class SwingGrossPay extends JFrame implements ActionListener
{
	JTextField hoursField, payRateField, grossPayField;
	JButton calcButton;

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

		JButton calcButton = new JButton("Calculate");
	    calcButton.addActionListener(this);
		add(calcButton);

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
		double grossPay, hours, payRate;
		DecimalFormat dollar = new DecimalFormat("#,##0.00");

		hours = Double.parseDouble(hoursField.getText());
		payRate = Double.parseDouble(payRateField.getText());
		grossPay = hours * payRate;
		grossPayField.setText("$" + dollar.format(grossPay));
	}
}//end Class
