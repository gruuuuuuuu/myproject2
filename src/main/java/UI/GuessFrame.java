package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Fields
    JButton button= new JButton("HI");
    JLabel label = new JLabel("Zzzz...");
    JTextField number = new JTextField(8);
    //Constructors
    //super 呼叫副類別的程式碼
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(400,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num =Integer.parseInt(number.getText());
                System.out.println(num);
              //  System.out.println("Hello!");
//                label.setText("Hello!");
            }
        });
//        若下面這行沒一道上面，則上面無法打出label
//        JLabel label = new JLabel("Zzzz...");
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }
    //Methods


    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600,500);
//        guessFrame.setVisible(true);
    }
}
