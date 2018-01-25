/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoioobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thuandd
 */
public class DemoIOobject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<SinhVien> list =new  ArrayList<SinhVien>();
        for (int i = 0; i < 10; i++) {
            list.add(new SinhVien(1, "Nguyen Van A" + i));
        }
        
        // dua list vao file
        ObjectOutputStream objectOutputStream = null;
        try {
            // khi dong objectoutput stream thi dong luon file outout stream
            // muon dung chuc nang thang nao thi phai cho thang day vao ben trong
            // muon ghi xuong file phai cho file vao Object outputstream
            // dau vao la object xong ghi xuong   file thi object phai noi voi file
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("sinhvien.dat"));
            objectOutputStream.writeObject(list);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoIOobject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoIOobject.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoIOobject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // doc file
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("sinhvien.dat"));
            Object o = objectInputStream.readObject();
            if(o instanceof List) {
                List<SinhVien> sinhviens = (List<SinhVien>) o;
                for (SinhVien sinhvien : sinhviens) {
                    System.out.println(sinhvien);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoIOobject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoIOobject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoIOobject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
