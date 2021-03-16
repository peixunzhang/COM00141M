 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingArea extends JPanel {
 
     // You only need to edit the method below.
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      // the size of the circle
      // the color (this is blue, believe it or not, play around with different values)
     
      
      // You might want to introduce a loop somewhere here.
      for (int size =350; size >= 150; size  -=20) {
          int icol =(int)(Math.random()*65536);
          Color c = new Color(icol);
          g.setColor(c);
          g.drawOval(200-size/2,200-size/2,size,size);


      }

    }// the end of the method....
}