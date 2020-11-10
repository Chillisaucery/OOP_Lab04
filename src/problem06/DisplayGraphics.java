package problem06;


import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel {

    private int[] numberList = {0,0,0,0,0};

    private Color[] colorList = {
            Color.black, Color.red, Color.gray, Color.green, Color.pink,
    };

    public DisplayGraphics(int[] numberList) {
        this.numberList = numberList;
    }

    public void paint(Graphics g) {

        Dimension size = g.getClipBounds().getSize();
        System.out.println(size);

        int width = size.height/12;
        int height = size.width/25;

        for (int count=0; count<=4; count++) {
            g.setColor(colorList[count]);
            g.fillRect(0, width + count * width * 2, numberList[count] * height, width);
        }

    }
}