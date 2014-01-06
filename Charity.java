import javax.swing.*;
import java.awt.*;
import java.awt.event.*;      // we need event classes

// The Charity class demonstrates writing to a textarea

public class Charity extends JFrame implements ActionListener{

 JTextArea myTextArea = new JTextArea("this is a text area. which is changing",6,30);
 
// Enter Donor Information
 JTextField myName = new JTextField("Enter Your First and Last Name");
 JTextField myAddress = new JTextField("Enter Your Address");
 JTextField myPhone = new JTextField("Enter Your Phone#");
 JTextField donationAmount = new JTextField("Enter Donation Amount");
 JTextField emailAddress = new JTextField("Enter Email Address");
 
 // Submit Donor Information
 JButton submit = new JButton("SUBMIT");   // create button
 JButton clear = new JButton("CLEAR");   // create button

// Program Panels
 JPanel buttonPanel = new JPanel();
 JPanel mainPanel = new JPanel();
 JPanel donorPanel = new JPanel();
 int clickCount = 0;

String[] charityList = { "Charity1", "Charity2", "Charity3" };
JComboBox comboBox = new JComboBox<String>(charityList);

Charity (){                           // the constructor
   super("Donate to Your Favorite Charity");
   submit.addActionListener(this);          // add listener
   buttonPanel.setLayout(new GridLayout(1,2));
   buttonPanel.add(submit);                // add button
   buttonPanel.add(clear);                // add button
   
   // Main Panel Content
   mainPanel.setLayout(new BorderLayout());
   mainPanel.add(myTextArea,BorderLayout.EAST);    // add text area
   mainPanel.add(buttonPanel, BorderLayout.SOUTH);
   
   // Donor Panel Content
   donorPanel.setLayout(new GridLayout(6,0));
   donorPanel.add(myName);
   donorPanel.add(myAddress);
   donorPanel.add(myPhone);
   donorPanel.add(comboBox);
   donorPanel.add(donationAmount);
   donorPanel.add(emailAddress);
   mainPanel.add(donorPanel, BorderLayout.WEST);
   
   add (mainPanel);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

 public void actionPerformed(ActionEvent e) {     // the actionPerformed method
       ++clickCount;
       myTextArea.append("\n" + clickCount);
  }

// creating an Charity object

  public static void main(String[] args) {
    TextArea frame = new TextArea();
    frame.setSize(600,300);
    frame.setLocation(300,330);
    frame.setVisible(true);

  }
} // end of the Charity class.