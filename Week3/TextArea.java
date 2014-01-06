import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

// The TextArea class demonstrates writing to a textarea

public class TextArea extends JFrame implements ActionListener{

 JTextArea myTextArea = new JTextArea("this is a text area",6,30);
 JTextField myName = new JTextField("Enter Your Name");
 JTextField myAddress = new JTextField("Enter Your Address");
 JTextField myPhone = new JTextField("Enter Your Phone#");
 JTextField donationAmount = new JTextField("Enter Amount");
 JTextField emailAddress = new JTextField("Enter Email Address");
 
 JButton submit = new JButton("SUBMIT");   // create button
 JButton clear = new JButton("CLEAR");   // create button

 JPanel buttonPanel = new JPanel();
 JPanel mainPanel = new JPanel();
 JPanel donorPanel = new JPanel();
 int clickCount = 0;

String[] charityList = { "Charity1", "Charity2", "Charity3" };
JComboBox comboBox = new JComboBox<String>(charityList);

TextArea (){                           // the constructor
   super("myButtonJFrame");
   submit.addActionListener(this);          // add listener
   buttonPanel.setLayout(new GridLayout(1,2));
   buttonPanel.add(submit);                // add button
   buttonPanel.add(clear);                // add button
   
   mainPanel.setLayout(new BorderLayout());
   mainPanel.add(myTextArea,BorderLayout.EAST);    // add text area
   mainPanel.add(buttonPanel, BorderLayout.SOUTH);
   
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

// creating an TextArea object

  public static void main(String[] args) {
    
    //JFrame F = new JFrame("");

    TextArea frame = new TextArea();
    frame.setSize(600,300);
    frame.setLocation(300,330);
    frame.setVisible(true);

    try {
          frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("/Users/michaela/Sites/PRG421/Week4/background.jpg")))));///Finding the Image
        }
          catch(IOException e) ///Catching Image
        {
          System.out.println("Image Doesn't exist");
        }
          frame.setResizable(false);//Option
          frame.setSize(400, 300);
          frame.setVisible(true);
        }
} // end of the TextArea class.