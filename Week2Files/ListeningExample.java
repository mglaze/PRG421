//Demonstrates Text Field and Quit Button
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ListeningExample extends JFrame implements ActionListener {
    //Demonstrates integer input
    JButton incr_button;
    JButton quit_button;
    JTextField number_field;

    public ListeningExample() {
        incr_button = new JButton("Increment");
        quit_button = new JButton("Quit");
        number_field = new JTextField();

        incr_button.addActionListener(this);
        quit_button.addActionListener(this);

        add(incr_button, BorderLayout.NORTH);
        add(number_field, BorderLayout.CENTER);
        add(quit_button, BorderLayout.SOUTH);
        pack();
    }

    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == incr_button) {
            int i = Integer.parseInt(number_field.getText());
            number_field.setText("" + (i + 1));
        } else if(evt.getSource() == quit_button) {
            System.exit(0); // The System.exit class method halts entire program
        }
    }

    public static void main(String[] args) {
        ListeningExample frame = new ListeningExample();
		frame = new ListeningExample();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100, 100);
		frame.pack();
		frame.setVisible(true);

    }
}
