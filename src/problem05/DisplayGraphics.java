package problem05;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DisplayGraphics extends JPanel{
    public void paintComponent(Graphics g) {
        Dimension size = g.getClipBounds().getSize();
        int height = size.height;
        int width = size.width;
        int x = width / 2 - 10;
        int y = height / 2 - 10;
        int w = 20;
        int h = 20;
        int startAngle = 0;
        int arcAngle = 180;
        int depth = 10;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                y = y - depth;
                w = w + 2 * depth;
                h = h + 2 * depth;
                g.drawArc(x, y, w, h, startAngle, -arcAngle);
            } else {
                x = x - 2 * depth;
                y = y - depth;
                w = w + 2 * depth;
                h = h + 2 * depth;
                g.drawArc(x, y, w, h, startAngle, arcAngle);
            }
        }
    }
}