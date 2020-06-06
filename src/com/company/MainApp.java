package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    private JButton btn_2Button;
    private JPanel panel1;
    private JButton btn_1Button;

    public MainApp() {
        btn_1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Bericht 1");
            }
        });
        btn_2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Bericht 2");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("MainApp");
        frame.setContentPane(new MainApp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(256,128);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}
