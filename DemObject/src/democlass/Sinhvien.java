/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlass;

import java.util.Scanner;

/**
 *
 * @author thuandd
 */
public class Sinhvien {
    public int ma;
    public String hoten;
    public Thoigian ngaysinh = new Thoigian();
    public void Nhap() {
        System.out.println("Nhap ma:");
        this.ma = new Scanner(System.in).nextInt();
        System.out.println("Nhap ten:");
        this.hoten = new Scanner(System.in).nextLine();
        this.ngaysinh.nhap();
    }
    public void Xuat() {
        Thoigian hientai = new Thoigian();
        hientai.ngay = 2;
        hientai.thang = 1;
        hientai.nam = 2018;
        System.out.println("Ma: " +this.ma +" ,ho va ten: " + this.hoten);
        System.out.println("Ngay " +this.ngaysinh.ngay +" thang " + this.ngaysinh.thang + " nam " + this.ngaysinh.nam);
        System.out.println("Tuoi:" + this.tuoi(hientai));
    }
    public int tuoi(Thoigian hientai) {
        if(hientai.nam > this.ngaysinh.nam) {
            if(hientai.thang > this.ngaysinh.thang) {
                return hientai.nam - this.ngaysinh.nam + 1;
            }
            if(hientai.thang < this.ngaysinh.thang) {
                return hientai.nam - this.ngaysinh.nam;
            }
            if(hientai.ngay > this.ngaysinh.ngay) {
                return hientai.nam - this.ngaysinh.nam + 1;
            }         
            return hientai.nam - this.ngaysinh.nam;
        } 
        
        return 1;
    }
    public int sosanh(Sinhvien sv1) {
        return this.ngaysinh.soSanh(sv1.ngaysinh);
    }
}
