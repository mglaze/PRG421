//This application displays a button with a smiley face
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JButtonExample extends JFrame implements ActionListener
{
   private JLabel buttonLabel;
   private JButton aJButton, anotherJButton;
   private Icon aGif = new ImageIcon("smile.gif");
   private JPanel content = new JPanel();//needed for background color

   public JButtonExample(String title) //Constructor
   {
      setTitle(title);

      content.setLayout(new FlowLayout());
      buttonLabel = new JLabel("Click a button", SwingConstants.CENTER);
      buttonLabel.setFont(new Font("Lucida",Font.PLAIN,24)); //24 = size
      buttonLabel.setForeground(Color.red);
      content.add(buttonLabel);

      aJButton = new JButton("Sad");
      aJButton.addActionListener(this);
      aJButton.setPreferredSize(new Dimension(100, 200));
      content.add(aJButton);

      anotherJButton = new JButton(aGif);//add button icon
      anotherJButton.setActionCommand("Happy");
      anotherJButton.addActionListener(this);
      anotherJButton.setPreferredSize(new Dimension(100, 200));
      content.add(anotherJButton);

      content.setBackground(Color.white);
      add(content);

   }//end Constructor

   public void actionPerformed(ActionEvent e)
   {
      if (e.getActionCommand().equals("Sad"))
         content.setBackground(Color.gray);
      else if (e.getActionCommand().equals("Happy"))
         content.setBackground(Color.yellow);
   }//end actionPerformed

   public static void main(String[] args)
   {
      JButtonExample jb = new JButtonExample("JButton Example");

      Toolkit tk = Toolkit.getDefaultToolkit();
	  ImageIcon frameIcon = new ImageIcon("smart.gif");
	  jb.setIconImage(frameIcon.getImage());
	  jb.setLocationRelativeTo(null);

      jb.pack();
      jb.setVisible(true);
   }//end main
}