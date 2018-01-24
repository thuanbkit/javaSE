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
public class ThuVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLmuonsach quanly = new QLmuonsach();
        while(true) {
            System.out.println("Menu:");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2 . Nhap danh sach ban doc");
            System.out.println("3 . Cho muon");
            System.out.println("4 . Tra sach");
            System.out.println("Chon chuc nang:");
            int c = new Scanner(System.in).nextInt();
            switch (c) {
                case 1:
                    quanly.NhapdsSach();
                    break;
                case 2:
                    quanly.NhapdsBanDoc();
                    break;
                case 3:
                    quanly.choMuon();
                    break;
                case 4:
                    quanly.traSach();
                    break;
                default:
                    System.out.println("Khong co chuc nang da chon");
            }
        }
    }    
}
