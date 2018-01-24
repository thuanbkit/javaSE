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
public class Sach {
    private static int ma_auto = 0;
    private String ma;
    private String ten;
    private String tacgia;
    private int loai;
    public static final int KHKT = 1;
    public static final int VHNT = 2;
    public static final int TSL = 3;
    
    public Sach() {
        ma_auto++;
        this.ma = "SACH" + ma_auto;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public int getLoai() {
        return loai;
    }

    public String getNameLoai() {
        String name = "";
        switch (this.loai) {
            case KHKT:
                name = "Khoa hoc ki thuat";
                break;
            case VHNT:
                name = "Van hoc nghe thuat";
                break;
            case TSL:
                name = "tieng so luong";
                break;

        }
        return name;
    }

    public void nhap() {
        System.out.println("Ten sach,Tac gia,Loai sach(1 - KHKT,2 -VHNT ,3 -TSL):");
        this.setTen(new Scanner(System.in).nextLine());
        this.setTacgia(new Scanner(System.in).nextLine());
        this.setLoai(new Scanner(System.in).nextInt());
    }

    public void in() {
        System.out.println("Ma:" + this.getMa()
                + " Ten sach: " + this.getTen()
                + " Tac gia: " + this.getTacgia()
                + " Loai " + this.getNameLoai()
        );
    }
}
