/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlass;

/**
 *
 * @author thuandd
 */
public class DemoClass {

    /**
     * @param args the command line arguments
     * tinh tuoi tu ngay sinh
     * so sanh tuoi,sap xep sinh vien theo tuoi,
     */
    public static void main(String[] args) {
        Sinhvien[] ds =  new Sinhvien[2];
//        for(Sinhvien sinhvien:ds) {
//            sinhvien = new Sinhvien();
//            sinhvien.Nhap();
//        }
        for (int i = 0; i < ds.length; i++) {
            int j = i+1;
            System.out.println("Nhập sinh viên thứ " + j);
            ds[i] = new Sinhvien();
            ds[i].Nhap();
        }
        for (int i = 0; i < ds.length; i++) {
            for (int j = i; j < ds.length; j++) {
                if(ds[i].sosanh(ds[j]) == 1) {
                   Sinhvien sv = new Sinhvien();
                   sv = ds[i];
                   ds[i] = ds[j];
                   ds[j] = sv;
                }
            }
        }
        for (int i = 0; i < ds.length; i++) {
            Sinhvien sv = ds[i];
            sv.Xuat();
        }
        for (Sinhvien sinhvien : ds) {
            sinhvien.Xuat();
        }
    }
    
}
