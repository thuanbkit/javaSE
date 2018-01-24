/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvien;

import java.util.Scanner;

/**
 *
 * @author Adminis
 */
public class Thoigian {
    private int ngay;
    private int thang;
    private int nam;

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public void nhap() {
        System.out.println("Ngay ? thang ? nam ?");
        this.setNgay(new Scanner(System.in).nextInt());
        this.setThang(new Scanner(System.in).nextInt());
        this.setNam(new Scanner(System.in).nextInt());
    }
    public void in() {
        System.out.println("ngay " + this.ngay + 
                " thang " + this.thang + 
                " name " + this.nam
        );
    }
    public int diffDays(Thoigian tg2) {
        return this.ngay - tg2.ngay;
        
    }
}
