// An exception-handling example
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumericInput extends JFrame
   implements ActionListener {

   private JTextField inputField;
   private JButton readButton;

   // set up GUI
   public NumericInput()
   {
      setTitle( "Demonstrating Exceptions" );

      setLayout( new GridLayout( 2, 2 ) );

      // set up label and inputField
     add(new JLabel( "Enter number "));
     inputField = new JTextField (10);
     add(inputField);

      //Add button
      readButton = new JButton ("Enter Number");
      add (readButton);
      readButton.addActionListener(this);

      setSize( 425, 100 );
      setLocationRelativeTo(null);
      setVisible( true );

   } // end constructor

   // process GUI events
   public void actionPerformed( ActionEvent event )
   {

      // read input

      try {
         double number1 = Double.parseDouble( inputField.getText() );
         JOptionPane.showMessageDialog( null, "Thank You, GoodBye");
         System.exit(0);  //Close Program
      }

      // process improperly formatted input
      catch ( NumberFormatException ne ) {
         JOptionPane.showMessageDialog( null, "Enter a valid number");
      }

   } // end method actionPerformed

   public static void main( String args[] )
   {
      NumericInput application = new NumericInput();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // end class NumericInput


