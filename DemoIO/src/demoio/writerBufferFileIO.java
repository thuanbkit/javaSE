/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adminis
 */
public class writerBufferFileIO {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("demo2.txt",true));
            System.out.println("Nhap vao 4 dong");
            for (int i = 0; i < 4; i++) {
                String s = new Scanner(System.in).nextLine();
                writer.write(s+"\n");
            }
            writer.flush();
        } catch (IOException ex) {
            Logger.getLogger(writerBufferFileIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(writerBufferFileIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
