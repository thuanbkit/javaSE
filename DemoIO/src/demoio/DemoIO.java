/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adminis
 */
public class DemoIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileOutputStream fileoutput = null;
        try {
            // TODO code application logic here
            fileoutput = new FileOutputStream("demo.txt", true);
            String s = new Scanner(System.in).nextLine();
            fileoutput.write(s.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileoutput.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
