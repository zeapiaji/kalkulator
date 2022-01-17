package kalkulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kalkulator {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton tambahkanButton;
    private JPanel Main;
    private JButton kurangiButton;
    private JButton bagiButton;
    private JButton kaliButton;

    public kalkulator() {
        tambahkanButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,jumlah;
                a = Integer.parseInt(textField1.getText());
                b = Integer.parseInt(textField2.getText());
                jumlah = a + b;
                textField3.setText(Integer.toString(jumlah));
            }
        });
        kurangiButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,jumlah;
                a = Integer.parseInt(textField1.getText());
                b = Integer.parseInt(textField2.getText());
                jumlah = a - b;
                textField3.setText(Integer.toString(jumlah));
            }
        });
        bagiButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,jumlah;
                a = Integer.parseInt(textField1.getText());
                b = Integer.parseInt(textField2.getText());
                jumlah = a / b;
                textField3.setText(Integer.toString(jumlah));
            }
        });
        kaliButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,jumlah;
                a = Integer.parseInt(textField1.getText());
                b = Integer.parseInt(textField2.getText());
                jumlah = a * b;
                textField3.setText(Integer.toString(jumlah));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("kalkulator");
        frame.setContentPane(new kalkulator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
