package problem02;

import java.awt.*;
import javax.swing.*;

public class DisplayGraphics extends JPanel {

    public void paint(Graphics g) {

        Dimension size = g.getClipBounds().getSize();
        System.out.println(size);

        int width = size.width;
        int height = size.height;

        g.drawLine(0,0, width, height);
        g.drawLine(width, 0, 0, height);

        g.drawLine(0, height/2, width, height/2);
        g.drawLine(width/2,0, width/2, height);
    }


}