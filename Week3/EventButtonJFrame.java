import javax.swing.*;
import java.awt.*;
import java.awt.event.*;      // we need event classes

// The EventButtonJFrame class extends JFrame AND implements
// actionlistener (implementing means providing a method
// action performed that takes an ActionEvent as input
// and responds appropriately.

public class EventButtonJFrame extends JFrame implements ActionListener{

 JTextArea myTextArea = new JTextArea("this is a text area",6,30);
 JButton myCountButton = new JButton("count");   // create button
 JPanel buttonPanel = new JPanel();
 JPanel mainPanel = new JPanel();
 int clickCount = 0;

 EventButtonJFrame (){                           // the constructor
   super("myButtonJFrame");
   myCountButton.addActionListener(this);          // add listener
   buttonPanel.setLayout(new GridLayout(4,0));
   buttonPanel.add(myCountButton);                // add button
   mainPanel.setLayout(new BorderLayout());
   mainPanel.add(myTextArea,BorderLayout.CENTER);    // add text area
   mainPanel.add(buttonPanel, BorderLayout.EAST);
   add (mainPanel);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

 public void actionPerformed(ActionEvent e) {     // the actionPerformed method
       ++clickCount;
       myTextArea.append("\n" + clickCount);
  }

// creating an EventButtonJFrame object

  public static void main(String[] args) {
    EventButtonJFrame frame = new EventButtonJFrame();
    frame.setSize(300,200);
    frame.setLocation(300,330);
    frame.setVisible(true);

  }
} // end of the EventButtonJFrame class.

