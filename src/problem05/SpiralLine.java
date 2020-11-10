package problem05;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SpiralLine extends JPanel{
    public void paintComponent(Graphics g){
        Dimension size = g.getClipBounds().getSize();
        int h = size.height;
        int w = size.width;


        int widthCenter = w / 2;
        int heightCenter = h / 2;

        for (int i = 0; i < 100 ; i++)
        {
            g.drawLine(widthCenter + (20 * i), heightCenter - (20 * i), widthCenter + (20 * i), heightCenter + 20 + (20 * i));
            g.drawLine(widthCenter + (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i));
            g.drawLine(widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i));
            g.drawLine(widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i), widthCenter + 20 + (20 * i), heightCenter - 20 - (20 * i));
        }
    }
}