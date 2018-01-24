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
public class BanDoc {

    public static int ma_auto = 0;
    private String ma;
    private String ten;
    private int rule = 1;

    public BanDoc() {
        ma_auto++;
        this.ma = "BD" + ma_auto;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getRule() {
        return rule;
    }



    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setRule(int rule) {
        this.rule = rule;
    }

    public void nhap() {
        System.out.println("Ten ban doc:");
        this.setTen(new Scanner(System.in).nextLine());
    }

    public void in() {
        System.out.println("Ma:" + this.getMa()
                + " Ten: " + this.getTen()
                + " Co quyen muon sach:" + this.getRule());
    }

}
