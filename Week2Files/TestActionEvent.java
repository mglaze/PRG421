// TestActionEvent.java: Create two buttons in the frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestActionEvent extends JFrame
  implements ActionListener
{
  // Create an object for each button
  private JButton jbtOk = new JButton("OK");
  private JButton jbtCancel = new JButton("Cancel");

  // Default constructor
  public TestActionEvent()
  {
    // Set the window title
    setTitle("TestActionEvent");

    // Set FlowLayout manager to arrange the components
    // inside the frame
    setLayout(new FlowLayout());

    // Add buttons to the frame
    add(jbtOk);
    add(jbtCancel);

    // Register listeners
    jbtOk.addActionListener(this);
    jbtCancel.addActionListener(this);
  }

  // Main method
  public static void main(String[] args)
  {
    TestActionEvent frame = new TestActionEvent();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(100, 100);
    frame.setVisible(true);
  }

  // This method will be invoked when a button is clicked.
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == jbtOk)
    {
      JOptionPane.showMessageDialog(null, "The OK button is clicked");
    }
    else if (e.getSource() == jbtCancel)
    {
	  JOptionPane.showMessageDialog(null, "The Cancel button is clicked");
    }
  }
}

