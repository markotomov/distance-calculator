package pv3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JDialog {
    private JPanel contentPane;
    private JButton Calculate;
    private JTextField Scale;
    private JTextField textField1;


    public calc() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(Calculate);

        Calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void main(String[] args) {
        calc dialog = new calc();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
