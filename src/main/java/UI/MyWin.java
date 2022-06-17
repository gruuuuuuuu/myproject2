package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        //swing => 負責java GUI, JavaFX
        //extension => 後來擴充出來的
        JFrame frame = new JFrame();
        frame.setSize(700,300);
        frame.setLocation(400,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //DISPOSE_ON_CLOSE => 把所有指令都停止，除了視窗關閉，程式也會停止

        // add Component
        JButton button = new JButton("OK");
        //匿名類別, Anonymous
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("i'm gru");
            }
        });

        //有名類別
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);

        // Layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setVisible(true);
        System.out.println("END！");
    }
}
