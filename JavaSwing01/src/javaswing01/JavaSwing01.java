/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing01;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author thuandd
 */
public class JavaSwing01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(300, 400);
        // khi dong frame la dong luon chuong trinh
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb = new JButton("Bấm vào đây");
        // cach dua 1 thanh phan giao dien len frame
        jFrame.getContentPane().add(jb);
    }
    
}
