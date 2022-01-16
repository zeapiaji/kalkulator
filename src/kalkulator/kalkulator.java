package kalkulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kalkulator {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton tambahkanButton;

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
    }
}
