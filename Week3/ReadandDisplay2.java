import javax.swing.*;
import java.awt.*;
import java.awt.event.*;      // we need event classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


// The ReadandDisplay2 class demonstrates writing to a textarea

public class ReadandDisplay2 extends JFrame{

 JTextArea myTextArea = new JTextArea("this is a text area\n",6,30);
 JPanel mainPanel = new JPanel();
 int clickCount = 0;

 ReadandDisplay2 (){                           // the constructor
   setTitle("myButtonJFrame");
   mainPanel.setLayout(new BorderLayout());
   mainPanel.add(myTextArea,BorderLayout.CENTER);    // add text area
   add (mainPanel);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


   	File file = new File("input.txt");

   	try {
   	      Scanner scanner = new Scanner(file);
   	         while (scanner.hasNextLine()) {
   	                String line = scanner.nextLine();
   	                myTextArea.append(line + "\n");
   	          }
   	        } catch (FileNotFoundException e) {
   	              JOptionPane.showMessageDialog(null, "Cannot find file, input.txt");
   	              System.exit(0);

   	       }

  }

// creating an ReadandDisplay2 object

  public static void main(String[] args) {
    ReadandDisplay2 frame = new ReadandDisplay2();
    frame.setSize(300,200);
    frame.setLocation(300,330);
    frame.setVisible(true);

  }
} // end of the ReadandDisplay2 class.

