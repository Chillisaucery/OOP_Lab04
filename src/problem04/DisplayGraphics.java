package problem04;


import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel {

    public void paint(Graphics g) {

        Dimension size = g.getClipBounds().getSize();
        System.out.println(size);

        int width = size.width;
        int height = size.height;

        int lineNumber = 15;

        //Drawing from top-left corner
        int xBegin = 0;
        int yBegin = 0;

        int count = 0;
        int space = 0;
        while (true) {
            if (count >lineNumber)
                break;

            //Calculating
            xBegin = count * width / lineNumber;
            yBegin = count * height / lineNumber;

            //Drawing
            //Left side
            g.drawLine(0, yBegin, xBegin, height);
            g.drawLine(xBegin, 0, 0, height-yBegin);
            //Right side
            g.drawLine(xBegin, 0, width, yBegin);
            g.drawLine(xBegin, height, width, height - yBegin);

            //Increment
            count++;
        }




    }


}