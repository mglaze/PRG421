import javax.swing.*;
import java.awt.*;
import java.awt.event.*;      // we need event classes
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


// The TextArea class demonstrates writing to a textarea

public class TextArea extends JFrame implements ActionListener{

 JTextArea myTextArea = new JTextArea("",6,30);
 JPanel mainPanel = new JPanel();

TextArea (){                           // the constructor
   super("Week 4 Text Area Assignment");
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

 public void actionPerformed(ActionEvent e) {     // the actionPerformed method
  }

// creating an TextArea object

  public static void main(String[] args) {
    TextArea frame = new TextArea();
    frame.setSize(300,200);
    frame.setLocation(300,330);
    frame.setVisible(true);
  }
} // end of the TextArea class.