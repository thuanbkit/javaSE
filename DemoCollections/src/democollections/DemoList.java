/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollections;

import java.util.ArrayList;
import java.util.List;
import model.Sinhvien;

/**
 *
 * @author Adminis
 */
public class DemoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ArrayList khong dong bo luong
        List list = new ArrayList();
        list.add("aa");
        for (int i = 0; i < 10; i++) {
            list.add(new Sinhvien("nguyen van a" + i, "00" + i, "1" + i));
        }
        for (int i = 0; i < list.size(); i++) {
            Object get = list.get(i);
            if (get instanceof Sinhvien) {
                Sinhvien sv = (Sinhvien) get;
                System.out.println(sv);
            }
        }
        System.out.println("for: use nhieu");
        for (Object get : list) {
            if (get instanceof Sinhvien) {
                Sinhvien sv = (Sinhvien) get;
                System.out.println(sv);
            }
        }
    }

}
