/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author thuandd
 */
public class LoginFrame_multilayout extends JFrame{
    JLabel jlUsername;
    JLabel jlPassword;
    JTextField jtfUsername;
    JPasswordField jpfPasswordField;
    JButton jbtLogin;
    JButton jbtReset;
    JPanel jptop,jpfooter,jpcenter;

    public LoginFrame_multilayout() throws HeadlessException{
        jlUsername = new JLabel("Username");
        jlPassword = new JLabel("Password");
        jtfUsername = new JTextField(10);
        jpfPasswordField = new JPasswordField(10);
        jbtLogin = new JButton("login");
        jbtReset = new JButton("Reset");
        jptop = new JPanel();
        jpfooter = new JPanel();
        jpcenter = new JPanel();
        jptop.setBackground(Color.red);
        jpcenter.setBackground(Color.GRAY);
        jpfooter.setBackground(Color.MAGENTA);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.setSize(300, 300);
        this.getContentPane().add(jptop,BorderLayout.NORTH);
        this.getContentPane().add(jpcenter,BorderLayout.CENTER);
        this.getContentPane().add(jpfooter,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new LoginFrame_multilayout();
    }
    
}
