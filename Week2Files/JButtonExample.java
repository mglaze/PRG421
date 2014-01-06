//This application displays a button with a smiley face
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JButtonExample extends JFrame implements ActionListener
{
   private JLabel buttonLabel;
   private JButton aJButton, anotherJButton;
   private Icon aGif = new ImageIcon("smile.gif");
   private Container cp;//needed for background color

   public JButtonExample(String title) //Constructor
   {
      setTitle(title);

      cp = getContentPane();
      cp.setLayout(new FlowLayout());
      buttonLabel = new JLabel("Click a button", SwingConstants.CENTER);
      buttonLabel.setFont(new Font("Lucida",Font.PLAIN,24)); //24 = size
      buttonLabel.setForeground(Color.red);
      cp.add(buttonLabel);

      aJButton = new JButton("Sad");
      aJButton.addActionListener(this);
      aJButton.setPreferredSize(new Dimension(100, 200));
      cp.add(aJButton);

      anotherJButton = new JButton(aGif);//add button icon
      anotherJButton.setActionCommand("Happy");
      anotherJButton.addActionListener(this);
      anotherJButton.setPreferredSize(new Dimension(100, 200));
      cp.add(anotherJButton);

      cp.setBackground(Color.white);

   }//end Constructor

   public void actionPerformed(ActionEvent e)
   {
      if (e.getActionCommand().equals("Sad"))
         cp.setBackground(Color.gray);
      else if (e.getActionCommand().equals("Happy"))
         cp.setBackground(Color.yellow);
   }//end actionPerformed

   public static void main(String[] args)
   {
      JButtonExample jb = new JButtonExample("JButton Example");

      Toolkit tk = Toolkit.getDefaultToolkit();
	  ImageIcon frameIcon = new ImageIcon("smart.gif");
	  jb.setIconImage(frameIcon.getImage());

      jb.pack();
      jb.setVisible(true);
   }//end main
}