package problem06;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Dialog[] dialog = {
                new Dialog("1"),
                new Dialog("2"),
                new Dialog("3"),
                new Dialog("4"),
                new Dialog("5"),
        };

        int[] numberList = {0,0,0,0,0};

        for (int count=0; count <=4; count++)
            numberList[count] = dialog[count].number;

        DisplayGraphics m=new DisplayGraphics(numberList);
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        //f.setLayout(null);
        f.setVisible(true);

        return;
    }
}
