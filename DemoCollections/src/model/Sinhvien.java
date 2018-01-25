/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Adminis
 */
public class Sinhvien {
    private String ten;
    private String tuoi;
    private String ma;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Sinhvien(String ten, String tuoi, String ma) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.ma = ma;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "ten=" + ten + ", tuoi=" + tuoi + ", ma=" + ma + '}';
    }
}
