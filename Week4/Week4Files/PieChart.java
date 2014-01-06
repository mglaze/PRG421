/*
 Draws a pie chart, given the numbers of Democrats, Republicans, and
 Independents in the US Senate:
 53 Democrats
 45 Republicans
 2 Independents

 Office of the Clerk, United States House of Representatives. (n.d.).
 Office of the Clerk of the U.S. House of Representatives
 Retrieved December 16, 2013, from http://clerk.house.gov/member_info/cong.aspx
 */
   import java.awt.*;
   import javax.swing.JApplet;
   import java.text.DecimalFormat; // Formats number

public class PieChart extends JApplet
{
   DecimalFormat df = new DecimalFormat("00");

   public void paint(Graphics g) {

   double InternetExplorer, FireFox, Chrome, Safari, Opera, Total;	// Percentage of Browser Usage on w3 Schools

   double PercIE, PercFF, PercChrome, PercSafari, PercOpera;	// The percentages

   int x = 150, y = 50, w = 100, h = 100;	// defines the size of the pie
   int startAngle, degrees;	// will be used to draw a pie slice

   // Set the # of Senators in each party
   InternetExplorer = 11.7;
   FireFox = 27.2;
   Chrome = 54.1;
   Safari = 3.8;
   Opera = 1.7;


   // Compute percentages
   Total = InternetExplorer + FireFox + Chrome + Safari + Opera;

   // %Internet Explorer
   PercIE = (InternetExplorer * 100) / Total;

   // %FireFox
   PercFF = (FireFox * 100) / Total;

   // %Chrome
   PercChrome = (Chrome * 100) / Total;

   PercSafari = (Safari * 100) / Total;

   PercOpera = (Opera * 100) / Total;

   // Display/output results
   System.out.println("% IE = " + PercIE);
   System.out.println("% FireFox = " + PercFF);
   System.out.println("% Chrome = " + PercChrome);
   System.out.println("% Safari = " + PercSafari);
   System.out.println("% Opera = " + PercOpera);

   // Display the Pie Chart

   // Draw the Arc for IE
   startAngle = 0;
   degrees = (int)(PercIE * 360 / 100);
   g.setColor(Color.blue);
   g.fillArc(x, y, w, h, startAngle, degrees);
   //Write legend for IE
   g.drawString("Internet Explorer: " + df.format(PercIE) + "%", 300, 80);

   // Draw the Arc for FF
   startAngle = degrees;
   degrees = (int)(PercFF * 360 / 100);
   g.setColor(Color.red);
   g.fillArc(x, y, w, h, startAngle, degrees);
   
   //Write legend for FF
   g.drawString("FireFox: " + df.format(PercFF) + "%", 300, 100);

   // Draw the Pie for Chrome
   startAngle = startAngle + degrees;
   degrees = (int)(PercChrome * 360 / 100);
   g.setColor(Color.green);
   g.fillArc(x, y, w, h, startAngle, degrees);
   
   //Write legend for Chrome
   g.drawString("Chrome: " + df.format(PercChrome) + "%", 300, 120);

    // Draw the Pie for Safari
   startAngle = startAngle + degrees;
   degrees = (int)(PercSafari * 360 / 100);
   g.setColor(Color.orange);
   g.fillArc(x, y, w, h, startAngle, degrees);
   
   //Write legend for Safari
   g.drawString("Safari: " + df.format(PercSafari) + "%", 300, 140);

    // Draw the Pie for Opera
   startAngle = startAngle + degrees;
   degrees = (int)(PercOpera * 360 / 100);
   g.setColor(Color.black);
   g.fillArc(x, y, w, h, startAngle, degrees);
   
   //Write legend for Opera
   g.drawString("Opera: " + df.format(PercOpera) + "%", 300, 160);

   g.setColor(Color.black);
   g.drawString ("Reference:",0, 220);
   g.drawString ("Browser Statistics. (n.d.). Browser Statistics.", 0, 240);
   g.drawString ("Retrieved from http://www.w3schools.com/browsers/browsers_stats.asp", 0, 260);

   } // paint

} // PieChart

