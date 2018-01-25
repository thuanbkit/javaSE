/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import model.Sinhvien;

/**
 *
 * @author Adminis
 */
public class SetDemo {

    public static void main(String[] args) {
        Set set = new HashSet();
        for (int i = 0; i < 10; i++) {
            Sinhvien sv = new Sinhvien("nguyen van a" + i, "00" + i, "1" + i);
            set.add(sv);
            set.add(sv);
        }
        for (Object get : set) {
            if (get instanceof Sinhvien) {
                Sinhvien sv = (Sinhvien) get;
                System.out.println(sv);
            }
        }
        System.out.println("iterator --------------------------");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object get = it.next();
            if (get instanceof Sinhvien) {
                Sinhvien sv = (Sinhvien) get;
                System.out.println(sv);
            }

        }
    }

}
