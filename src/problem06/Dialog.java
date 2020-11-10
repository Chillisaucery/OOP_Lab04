package problem06;

import javax.swing.*;

public class Dialog {

    private String name;
    public int number;


    JFrame f;

    public Dialog (String input) {
        f=new JFrame();
        this.name=JOptionPane.showInputDialog(f,"Enter value of bar " + input);
        System.out.println(name);
        this.number = Integer.parseInt(name);
    }

    public void message() {
        JOptionPane.showMessageDialog(f,"Welcome, " + name + ", to Java Programming.");
    }
}
