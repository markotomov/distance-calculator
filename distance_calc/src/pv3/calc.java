package pv3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JDialog {
    private JPanel contentPane;
    private JButton Calculate;
    private JTextField Scale;
    private JTextField textField1;
    private JPanel result;
    private JLabel scale;
    private JLabel distance;
    private JLabel result1;


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
        double distance = Double.parseDouble(textField1.getText());
        double Scale2 = Double.parseDouble(Scale.getText());
        result1.setText(distance*Scale2/100000+"km");
    }

    public static void main(String[] args) {
        calc dialog = new calc();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
