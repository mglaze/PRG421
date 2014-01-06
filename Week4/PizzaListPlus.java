import javax.swing.*;
import java.awt.*;
import java.awt.event.*;      // we need event classes

// The PizzaListPlus class demonstrates validating a number field,
//a combobox selection, and the length of a name field.

public class PizzaListPlus extends JFrame implements ActionListener{

    //Make a scrolling text area
    JTextArea myTextArea = new JTextArea("Customer Orders", 3,30);
    //add textarea to the scrolling pane
    JScrollPane myScrollPane = new JScrollPane(myTextArea);

    JButton myOrderButton = new JButton("Make Order");   // create button
    JPanel northPanel = new JPanel();
    JPanel centerPanel = new JPanel();

    JTextField nameField = new JTextField (15);
    JTextField numberOrderedField = new JTextField ();

    //Make a combobox
    String[] pizzaList = {"Make Selection", "Small $5", "Medium $10", "Large $20" };
    JComboBox myComboBox = new JComboBox<String>(pizzaList);

    PizzaListPlus (){                           // the constructor
        setTitle("My Pizza Orders");
        setLayout(new BorderLayout());  //Layout for the Frame

        //configure north panel
        northPanel.setLayout(new GridLayout(4,3));
        northPanel.add(new JLabel ("Enter Name"));
        northPanel.add(nameField);
        northPanel.add(new JLabel ("How Many?"));
        northPanel.add(numberOrderedField);
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
        double numberOrdered = 0;
        boolean invalidNumber = false;  //Assume number is not invalid

        try
        {
               numberOrdered = Double.parseDouble(numberOrderedField.getText());
        } //end try
        // process improperly formatted input
        catch ( NumberFormatException ne )
	     {
              invalidNumber = true;  //The number was invalid
         } //end catch

        //The name must be greater than zero, a selection must be made from combobox and
        //number ordered must be valid
        if (customerName.length() == 0 || myComboBox.getSelectedIndex() == 0 || invalidNumber)
        {
            JOptionPane.showMessageDialog(null, "Please complete your order.");
        }//end if
        else
        {
		//Write order to textarea and clear fields
            myTextArea.append("\n" + nameField.getText() + "\t" + myComboBox.getSelectedItem() +
                              "\t" + numberOrdered);
            nameField.setText("");
            numberOrderedField.setText("");
            myComboBox.setSelectedIndex(0);
        }//end else
    }//end actionPerformed

    // creating an TextArea object

    public static void main(String[] args) {
        PizzaListPlus frame = new PizzaListPlus();
        frame.setSize(600,300);
        frame.pack();
        frame.setLocation(300,330);
        frame.setVisible(true);

    }
} // end of the PizzaListPlus class.