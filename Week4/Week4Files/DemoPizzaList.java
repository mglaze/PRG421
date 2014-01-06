import javax.swing.*;
import java.awt.*;
import java.awt.event.*;      // we need event classes

// The DemoPizzaList class demonstrates writing to a textarea

public class DemoPizzaList extends JFrame implements ActionListener{

 //Make a scrolling text area
 JTextArea myTextArea = new JTextArea("Customer Orders", 10 ,30);
 //add textarea to the scrolling pane
 JScrollPane myScrollPane = new JScrollPane(myTextArea);
 
 JButton myOrderButton = new JButton("Make Order");   // create button
 JPanel northPanel = new JPanel();
 JPanel centerPanel = new JPanel();

 JTextField nameField = new JTextField (15);
 JTextField numberField = new JTextField (2);

 //Make a combobox
 String[] pizzaList = {"Make Selection", "Small $5", "Medium $10", "Large $20" };
 JComboBox myComboBox = new JComboBox<String>(pizzaList);

DemoPizzaList (){                           // the constructor
   setTitle("My Pizza Orders");
   setLayout(new BorderLayout());  //Layout for the Frame

   //configure north panel
   northPanel.setLayout(new GridLayout(3,3));
   northPanel.add(new JLabel ("Enter Name"));
   northPanel.add(nameField);
   northPanel.add(new JLabel ("Enter Number of Pizzas"));
   northPanel.add(numberField);
   northPanel.add(myComboBox);
   northPanel.add(myOrderButton);// add button
   myOrderButton.addActionListener(this);          // add listener
   add(northPanel,BorderLayout.NORTH);//add northPanel to frame

   //configure center panel
   myScrollPane.setVerticalScrollBarPolicy(
                   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
   myTextArea.setEditable(false);
   centerPanel.add(myScrollPane);    // add scrollpane
   add (centerPanel,BorderLayout.CENTER); //add centerPanel to frame
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

 public void actionPerformed(ActionEvent e) {     // the actionPerformed method
     String customerName = nameField.getText();
     if (customerName.length()==0 || myComboBox.getSelectedIndex() ==0){
         JOptionPane.showMessageDialog(null, "Please enter your order.");
	 }
        //myComboBox.setSelectedIndex(0);
     myTextArea.append("\n" + customerName + "\n" + myComboBox.getSelectedItem()+ "\n" + "Number of pizzas: " + numberField.getText() );
     myComboBox.setSelectedIndex(0);
     nameField.setText("");

     try {
         double number1 = Double.parseDouble( numberField.getText() );
         JOptionPane.showMessageDialog( null, "Thank you for your order!");
         //System.exit(0);  //Close Program
      }

      // process improperly formatted input
      catch ( NumberFormatException ne ) {
         JOptionPane.showMessageDialog( null, "Enter a valid number of pizzas.");
      }
  }


  public static void main(String[] args) {
    DemoPizzaList frame = new DemoPizzaList();
    frame.setSize(600,300);
    frame.pack();
    frame.setLocation(300,330);
    frame.setVisible(true);

  }
} // end of the DemoPizzaList class.