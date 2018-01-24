/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmonhoc;

import java.util.Scanner;

/**
 *
 * @author Adminis
 */
public class MonHoc {
    public static final int LON_HON =1; 
    public static final int NHO_HON =-1; 
    public static final int BANG_NHAU =0; 
    public String ten;
    public int sochi;
    public void nhap() {
        System.out.println("Nhap ten mon hoc:");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("Nhap so tien chi:");
        this.sochi = new Scanner(System.in).nextInt();
    }
    public void xuat() {
        System.out.println(this.ten +":"+ this.sochi);
    }
    public int sosanh(MonHoc mh1) {
        if(this.sochi > mh1.sochi) {
            return LON_HON;
        }
        if(this.sochi < mh1.sochi) {
            return NHO_HON;
        }
        return BANG_NHAU;
        
    }
    
}
