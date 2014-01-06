import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

public class ShowBorderLayout extends JFrame {
    public ShowBorderLayout() {
	// Set BorderLayout with horizontal gap 5 and vertical gap 10
	setLayout(new BorderLayout(5, 10));

	// Add buttons to the frame
	add(new JButton("East"), BorderLayout.EAST);
	add(new JButton("South"), BorderLayout.SOUTH);
	add(new JButton("West"), BorderLayout.WEST);
	add(new JButton("North"), BorderLayout.NORTH);

	JButton center = new JButton("Center");
	center.setBackground(Color.BLUE); //Adding color
	add(center, BorderLayout.CENTER);
    }

    /* Main method */
    public static void main(String[] args) {
	ShowBorderLayout frame = new ShowBorderLayout();
	frame.setTitle("ShowBorderLayout");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 200);
	frame.setVisible(true);
    }
}
