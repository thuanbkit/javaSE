/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adminis
 */
public class readerBufferedFileIO {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("demo2.txt"));
            while(true) {
                String s = reader.readLine();
                if(s == null) break;
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(readerBufferedFileIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(readerBufferedFileIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(readerBufferedFileIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
