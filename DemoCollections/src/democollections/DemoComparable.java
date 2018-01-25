/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author thuandd
 */
public class DemoComparable {
    public static void main(String[] args) {
        // sinh vien phai la class comparable
        Set<SinhVien> treeSet = new TreeSet();
        treeSet.add(new SinhVien("thuan",1));
        // do class SinhVien la class comparable nen k can new Comparator
        List<SinhVien> sinhviens = new ArrayList<>();
        List<NhanVien> nhanviens = new ArrayList<>();
        Collections.sort(sinhviens);
        Collections.sort(nhanviens,new Comparator<NhanVien> () {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
               return 1;
            }
        });
    }
   
}
