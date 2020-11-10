package problem05;

import javax.swing.*;

public class PartA {
    public static void main(String[] args)
    {
        SpiralLine m = new SpiralLine();

        JFrame f = new JFrame();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);
        f.setSize(450, 450);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}