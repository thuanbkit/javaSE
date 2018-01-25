/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

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
        List<Sinhvien> list = new Vector<>();
        Sinhvien sv = new Sinhvien("abc","3333","333");
        list.add(sv);
        list.add(sv);
        list.add(sv);
        for (Sinhvien sinhvien : list) {
            System.out.println(sinhvien);
        }
        
        Set<String> set = new HashSet<>();
        set.add("abd");
        set.add("a23");
        for (String string : set) {
            System.out.println(string);
        }
    }
}
