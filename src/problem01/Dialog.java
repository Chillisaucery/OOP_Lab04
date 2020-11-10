package problem01;

import javax.swing.*;

public class Dialog {

    private String name;

    JFrame f;
    Dialog(){
        f=new JFrame();
        name=JOptionPane.showInputDialog(f,"Enter Name");
        System.out.println(name);
    }

    public void message() {
        JOptionPane.showMessageDialog(f,"Welcome, " + name + ", to Java Programming.");
    }
}
