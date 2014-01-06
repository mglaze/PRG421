/*
 * ShowFlowLayout.java
 * Uses a loop
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;

public class ShowFlowLayout2 extends JFrame {
    public ShowFlowLayout2() {
        // Get the content pane of the frame
        Container container = getContentPane();

        container.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // Add buttons to the frame
        for (int i = 1; i <= 10; i++)
            container.add(new JButton("Component " + i));
    }

    /** Main method */
    public static void main(String[] args) {
        ShowFlowLayout2 frame = new ShowFlowLayout2();
        frame.setTitle("ShowFlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
