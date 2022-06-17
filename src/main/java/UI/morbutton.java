package UI;

import javax.swing.*;
import java.awt.*;

public class morbutton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700,300);
        frame.setLocation(400,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("OK");
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(new JButton("Testing"));
        frame.add(new JButton("Hamesome"));
        frame.add(new JButton("Pretty"));
        frame.add(new JButton("Beautiful"));
        frame.add(new JButton("Awesome"));
        frame.add(new JButton("Chubby"));
        frame.setVisible(true);
        System.out.println
                ("END！");
    }
}
