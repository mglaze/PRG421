import java.awt.*;
import javax.swing.*;
    
class Demo1
{
    public static void main(String args[]){
    	JFrame f1=new JFrame("NetBeans IDE Installer");
    	f1.setSize(600,450);
    		
    	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f1.setLocationRelativeTo(null);
    	JButton nextButton=new JButton("Next >");
    	JButton cancelButton=new JButton("Cancel");		
    	JButton customizeButton=new JButton("Customize");
    		
    	JPanel buttonPane1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
    	JPanel buttonPane2=new JPanel(new FlowLayout(FlowLayout.CENTER));
    	buttonPane1.add(nextButton);
    	buttonPane1.add(cancelButton);
    	buttonPane2.add(customizeButton);
    		
    		
    	f1.add("South",buttonPane1);
    	f1.add("Center",buttonPane2);
    		
    	f1.setVisible(true);
    }
}
