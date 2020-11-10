package problem03;


import java.awt.*;
import javax.swing.*;

public class DisplayGraphics extends JPanel {

    public void paint(Graphics g) {

        Dimension size = g.getClipBounds().getSize();
        System.out.println(size);

        int width = size.width;
        int height = size.height;

        int lineNumber = 15;

        //Drawing from (0,0) and (width, height)
        int xEnd = 0;
        int yEnd = height;

        int count = 0;

        while (true) {
            if (xEnd>width || yEnd <0 || count >100)
                break;

            //Drawing
            g.drawLine(0,0, xEnd, yEnd);
            g.drawLine(width, height, xEnd, yEnd);

            //Increment
            xEnd = xEnd + width / lineNumber;
            yEnd = yEnd - height / lineNumber;
            count++;
        }


        //Drawing from (0,height) and (width, 0)
        xEnd = 0;
        yEnd = 0;

        count = 0;

        while (true) {
            if (xEnd>width || yEnd >height || count >100)
                break;

            //Drawing
            g.drawLine(0,height, xEnd, yEnd);
            g.drawLine(width, 0, xEnd, yEnd);

            //Increment
            xEnd = xEnd + width / lineNumber;
            yEnd = yEnd + height / lineNumber;
            count++;
        }

    }


}