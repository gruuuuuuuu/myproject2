package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFramePractice extends JFrame {
    JButton button = new JButton("OK !  GUESS ?");
    JLabel label = new JLabel("secret number is...");
    JTextField number = new JTextField(8);
    int secret = new Random().nextInt(20) + 1;

    public GuessFramePractice() {
        super();
        System.out.println("secret" + secret);
        setSize(500, 800);
        setLocation(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num > secret) {
                    label.setText("Smaller");
                } else if (num < secret) {
                    label.setText("Bigger");
                } else {
                    label.setText("Bingo, the secret number is " + secret);
                }
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);

    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}