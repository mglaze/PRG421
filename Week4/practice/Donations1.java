import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Donations1 extends JFrame implements ActionListener 
{

	JPanel textPanel, buttonPanel, donorPanel, imagePanel;
	JTextArea submitTextArea;
	JTextField myName, myAddress, myPhone, donationAmount, emailAddress;
	JLabel myNameLabel, myAddressLabel, myPhoneLabel, donationAmountLabel, emailAddressLabel, backgroundLabel;
	JButton submit, clear;
	JComboBox charityList;


	public Charity ()
	{
	
		//Background Image
		JLabel background=new JLabel(new ImageIcon("background.jpg"));
		
		//Create mainPanel for all buttons and fields
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(1, 2));

		//Main Panel
		//mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(1000, 500));
		mainPanel.add(background); //BACKGROUND IMAGE
		mainPanel.add(mainPanel, BorderLayout.PAGE_START);
		


		//Button Panel
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2, 1, 1, 1));
		//buttonPanel.add(submit);
		//buttonPanel.add(clear);
		mainPanel.add(buttonPanel, BorderLayout.LINE_START);



		mainPanel.setOpaque(true);
		return mainPanel;
	}

	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Tis the Season for Giving!");

		Donations1 demo = new Donations1();
		frame.setContentPane(demo.createContentPane());
		
		frame.setSize(1000,500);
		frame.setResizable(false);
    	frame.setLocationRelativeTo(null);
    	frame.pack();
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(Donations1.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){ // the actionPerformed method
  	}
	
}