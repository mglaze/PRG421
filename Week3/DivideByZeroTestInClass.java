// DivideByZeroTest.java
// An exception-handling example that checks for divide-by-zero.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DivideByZeroTestInClass extends JFrame implements ActionListener 
{

   private JTextField inputField1, inputField2, outputField;
   private JButton divButton;
   private int number1, number2, result;

   // set up GUI
   public DivideByZeroTestInClass()
   {
      //Display title of program
      setTitle( "Demonstrating Exceptions" );

      // Close frame on click
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // get content pane and set its layout
      JPanel contents = new JPanel();
      contents.setLayout( new GridLayout( 4, 2 ) );

      // set up label and inputField1
      contents.add(
         new JLabel( "Enter numerator ", SwingConstants.RIGHT ) );
      inputField1 = new JTextField();
      contents.add( inputField1 );

      // set up label and inputField2; register listener
      contents.add( new JLabel( "Enter denominator and press Enter ",
         SwingConstants.RIGHT ) );
      inputField2 = new JTextField();
      contents.add( inputField2 );
      inputField2.addActionListener( this );

      // set up label and outputField
      contents.add( new JLabel( "RESULT ", SwingConstants.RIGHT ) );
      outputField = new JTextField();
      outputField.setEditable(false);
      contents.add( outputField );

      //Add button
      divButton = new JButton ("Divide");
      contents.add (divButton);
      divButton.addActionListener(this);

      add(contents);
      pack();

      setSize( 425, 100 );
      setLocationRelativeTo(null);
      setVisible(true);


   } // end DivideByZeroTest constructor
   // process GUI events
   public void actionPerformed( ActionEvent event )
   {
      outputField.setText( "" );   // clear outputField

      // read two numbers and calculate quotient
      try {
         number1 = Integer.parseInt( inputField1.getText() );
         number2 = Integer.parseInt( inputField2.getText() );

         result = number1/number2;

         //Converts number to string
         outputField.setText( String.valueOf( result ) );
      }
      // Arithmetic Error Handling
      catch( ArithmeticException ne)
      {
         JOptionPane.showMessageDialog(null, "Your denominator cannot be zero.");
      }
      // Number Format Error
      catch( NumberFormatException xe)
      {
         JOptionPane.showMessageDialog(null, "You must enter two intergers.");
      }
      //General Error Handling
      catch( Exception ex) {
         JOptionPane.showMessageDialog( null, "Something went wrong.");
      }

}

   public static void main( String args[] )
   {
      DivideByZeroTestInClass application = new DivideByZeroTestInClass();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // end class DivideByZeroTest
