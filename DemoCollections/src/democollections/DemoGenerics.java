/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import model.Sinhvien;

/**
 *
 * @author Adminis
 */
public class DemoGenerics {
    public static void main(String[] args) {
        // list vector dong bo luong
        List<Sinhvien> list = new Vector<>();
        Sinhvien sv = new Sinhvien("abc","3333","333");
        list.add(sv);
        list.add(sv);
        list.add(sv);
        for (Sinhvien sinhvien : list) {
            System.out.println(sinhvien);
        }
        // set khong co trung du lieu
        Set<String> set = new HashSet<>();
        set.add("abd");
        set.add("abd");
        for (String string : set) {
            System.out.println(string);
        }
    }
}
