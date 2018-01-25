/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollections;

/**
 *
 * @author thuandd
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private int ma;

    public SinhVien(String ten, int ma) {
        this.ten = ten;
        this.ma = ma;
    }
    
    @Override
    public int compareTo(SinhVien o) {
        // ghi de phuong thuoc nay
        // neu this = o thi return 0
        // neu this > o thi return 1
        // neu this < o thi return -1
        return 0;
    }
    
}
