/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.FileInputStream;
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
public class ReadFileIO {
       public static void main(String[] args) {
           FileInputStream fileinput = null;
           try {
               fileinput = new FileInputStream("demo.txt");
               while(fileinput.available() != 0){
                   int read = fileinput.read();
//                   if(read == -1) {
//                       break;
//                   }
//                   if(fileinput.available() == 0) {
//                       break;
//                   }
                   System.out.print((char)read);
               }
           } catch (FileNotFoundException ex) {
               Logger.getLogger(ReadFileIO.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(ReadFileIO.class.getName()).log(Level.SEVERE, null, ex);
           } finally {
               try {
                   fileinput.close();
               } catch (IOException ex) {
                   Logger.getLogger(ReadFileIO.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
    } 
}
