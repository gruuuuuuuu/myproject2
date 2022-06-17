package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //Fields
    JButton button= new JButton("OK !  GUESS ?");
    JLabel label = new JLabel("secret number is...");
    JTextField number = new JTextField(8);
    int secret = new Random().nextInt(10)+1;

    //Constructors
    //super 呼叫副類別的程式碼
    public GuessFrame(){
        super();
        System.out.println("secret"+secret);
        setSize(600,400);
        setLocation(400,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num =Integer.parseInt(number.getText());
                System.out.println(num);
                if(num> secret){
                    label.setText("Smaller");
                }else if(num < secret){
                    label.setText("Bigger");
                }else{
                    label.setText("Bingo, the secret number is " + secret);
                }
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
