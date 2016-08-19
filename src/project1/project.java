/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mahmoud wageeh
 */
public class project extends JFrame implements ActionListener {

    blood_bank1 B = new blood_bank1();
    private JLabel l1 = new JLabel("User name");
    private JLabel l2 = new JLabel("Password");
    private JTextField t1 = new JTextField();
    private JPasswordField t2 = new JPasswordField();
    private JPanel p = new JPanel();
    private JButton b1 = new JButton("Login");
    private JButton b2 = new JButton("Cancel");

    public project() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth()) / 2, (size.height - getHeight()) / 2);
        p.setLayout(null);
        p.setSize(400, 220);
        p.setVisible(true);
        p.setBackground(new Color(74, 111, 102));
        l1.setBounds(5, 10, 80, 30);
        l1.setFont(new java.awt.Font("tahoma", 1, 15));
        l1.setForeground(Color.white);
        l2.setBounds(5, 50, 80, 30);
        l2.setFont(new java.awt.Font("tahoma", 1, 15));
        l2.setForeground(Color.white);
        t1.setBounds(100, 10, 250, 30);
        t1.setFont(new java.awt.Font("tahoma", 1, 15));
        t1.setForeground(Color.black);
        t2.setBounds(100, 50, 250, 30);
        t2.setFont(new java.awt.Font("tahoma", 1, 15));
        t2.setForeground(Color.black);
        b1.setBounds(130, 100, 80, 30);
        b2.setBounds(220, 100, 85, 30);
        b1.setBackground(Color.black);
        b1.setFont(new java.awt.Font("tahoma", 1, 15));
        b1.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setFont(new java.awt.Font("tahoma", 1, 15));
        b2.setForeground(Color.white);
        p.add(l1);
        p.add(l2);
        p.add(t1);
        p.add(t2);
        p.add(b1);
        p.add(b2);
        this.setSize(400, 220);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(p);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (t1.getText().equals("mahmoud") && t2.getText().equals("mw1111994")) {
            if (e.getSource() == b1) {

                blood_bank1 B = new blood_bank1();
                B.setVisible(true);
            }

        } else if (e.getSource() == b2) {
                System.exit(0);
        } else {
            System.out.println("YOUR USER NAME OR PASSWORD INCORRECT");
        }
    }
}
