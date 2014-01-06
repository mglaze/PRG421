import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Donations2 extends JFrame implements ActionListener 
{

	JPanel mainPanel, textPanel, buttonPanel, donorPanel;
	//JTextArea submitTextArea;
	JTextField myName, myAddress, myPhone, donationAmount, emailAddress;
	JLabel myNameLabel, myAddressLabel, myPhoneLabel, donationAmountLabel, emailAddressLabel, backgroundLabel;
	JButton submit, clear;
	
	String[] charityList = { "Charity1", "Charity2", "Charity3", "Charity4, Charity5" };
 	JComboBox comboBox = new JComboBox<String>(charityList);


	public Donations2 (){

		//JLabel background=new JLabel(new ImageIcon("background.jpg"));
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(donorPanel);
		mainPanel.add(buttonPanel);
		mainPanel.add(textPanel);

		donorPanel.setLayout(new GridLayout(6, 0));
		donorPanel.add(myName);
		donorPanel.add(myAddress);
		donorPanel.add(myPhone);
		donorPanel.add(comboBox);
		donorPanel.add(donationAmount);
		donorPanel.add(emailAddress);

		//add(mainPanel);

	}

	public static void main(String[] args){
		Donations2 frame = new Donations2();
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(Donations.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){

	}
	
}