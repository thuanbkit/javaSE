/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing01;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author thuandd
 */
public class LoginFrame extends JFrame{
    JLabel jlUsername;
    JLabel jlPassword;
    JTextField jtfUsername;
    JPasswordField jpfPasswordField;
    JButton jbtLogin;
    JButton jbtReset;

    public LoginFrame() throws HeadlessException{
        jlUsername = new JLabel("Username");
        jlPassword = new JLabel("Password");
        jtfUsername = new JTextField(10);
        jpfPasswordField = new JPasswordField(10);
        jbtLogin = new JButton("login");
        jbtReset = new JButton("Reset");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.setSize(300, 300);
        this.getContentPane().add(jlUsername);
        this.getContentPane().add(jtfUsername);
    }
    public static void main(String[] args) {
        new LoginFrame();
    }
    
}