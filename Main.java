package org.example;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame("Talk with Bob");
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        JPasswordField value = new JPasswordField();
        JLabel l1=new JLabel("Password:");
        l1.setBounds(20,150, 80,30);
        value.setBounds(100,157,100,20);
        JButton b=new JButton("Send");
        b.setBounds(80,80,95,30);
        JLabel l=new JLabel("Hi I am Bob");
        l.setBounds(50,10,100,20);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (Objects.equals(tf.getText(), "Hello")) {
                    l.setText("Hi");
                }
                if(Objects.equals(tf.getText(), "1 + 1")) {
                    l.setText("2");
                }
                if (Objects.equals(tf.getText(), "Whats your name")) {
                    l.setText("BOB");
                }
                if (Objects.equals(tf.getText(), "Whats your name?")) {
                    l.setText("BOB");
                }
                if (Objects.equals(tf.getText(), "whats 1 + 1")) {
                    l.setText("2");
                }
                if (Objects.equals(tf.getText(), "Whats 1 + 1")) {
                    l.setText("2");
                }
                if (Objects.equals(tf.getText(), "Whats 1 + 1?")) {
                    l.setText("2");
                }
                if (Objects.equals(tf.getText(), "whats 1 + 1?")) {
                    l.setText("2");
                }
                if (Objects.equals(tf.getText(), "1 + 1?")) {
                    l.setText("2");
                }
                if (Objects.equals(tf.getText(), "1 + 1 ?")) {
                    l.setText("2");
                }
                if (Objects.equals(tf.getText(), "1 + 1 ")) {
                    l.setText("2");
                }
                if (Objects.equals(tf.getText(), "Muck")) {
                    l.setText("Muck");
                }
                if (Objects.equals(tf.getText(), "Quit")) {
                    System.exit(0);
                }
                if (Objects.equals(tf.getText(), "Quit")) {
                    System.exit(0);
                }
            }

        });
        f.add(b);f.add(tf);f.add(l); f.add(value);  f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}  