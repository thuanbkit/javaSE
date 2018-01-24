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
 * tao hang so khong anh huong den thuat toan hieu nang chuong trinh
 * nhung no lam code trong sang hon,de hieu
 */
public class Thoigian {
    private final int LON_HON = 1;
    private final int BANG_NHAU = 0;
    private final int NHO_HON = -1;
    public int ngay;
    public int thang;
    public int nam;
    
    public void nhap() {
        System.out.println("Nhap nam sinh:");
        System.out.println("Ngay:");
        this.ngay = new Scanner(System.in).nextInt();
        System.out.println("Thang:");
        this.thang = new Scanner(System.in).nextInt();
        System.out.println("Nam:");
        this.nam = new Scanner(System.in).nextInt();
    }
    
    public boolean less(Thoigian t1) {
        
        if(this.nam > t1.nam) return true;
        
        if(this.nam < t1.nam) return false;

        if(this.thang > t1.thang) return true;

        if (this.thang < t1.thang) return false;

        if(this.ngay > t1.ngay) return true;
        
        return false;
        
    }
    public int soSanh(Thoigian t1) {
        
        if(this.nam > t1.nam) return LON_HON;
        
        if(this.nam < t1.nam) return NHO_HON;

        if(this.thang > t1.thang) return LON_HON;

        if (this.thang < t1.thang) return NHO_HON;

        if(this.ngay > t1.ngay) return LON_HON;
        
        if(this.ngay < t1.ngay) return NHO_HON;
        
        return BANG_NHAU;
        
    }
    
    
}
