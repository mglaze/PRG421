import java.awt.*;
import javax.swing.*;

// Applet code for the "Hello, world!" example.
// This should be saved in a file named as "HelloWorld.java".
public class HelloWorld extends JApplet {
    public void init() {

		JOptionPane.showMessageDialog(null, "Initializing");
  }
    public void stop() {

		JOptionPane.showMessageDialog(null, "Stopping");
   }
   // Print a message on the screen (x=20, y=10).
    public void paint(Graphics g) {
	JOptionPane.showMessageDialog(null, "Painting");

        g.drawString("Hello, world!", 100, 20);

        // Draws a circle on the screen (x=40, y=30).
        g.drawArc(40, 30, 20, 20, 0, 360);
    }
}
