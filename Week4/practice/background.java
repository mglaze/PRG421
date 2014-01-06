import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class background {

public static void main(String[] args) {

JFrame F = new JFrame("Ismail Application");

try	{
		F.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("/Users/michaela/Sites/PRG421/Week4/background.jpg")))));///Finding the Image
	}
		
	catch(IOException e) ///Catching Image
		{
			System.out.println("Image Doesn't exist");
		}
			F.setResizable(false);//Option
			F.setSize(400, 300);
			F.setVisible(true);
	}
}