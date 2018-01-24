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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QLMonHoc qlmonhoc = new QLMonHoc();
        int c =0;
        while(c!=4) {
                System.out.println("Phan mem quan ly mon hoc:");
                System.out.println("1.Nhap danh sach mon hoc");
                System.out.println("2.Hien thi danh sach vua nhap");
                System.out.println("3.Sap xep theo tin chi");
                System.out.println("4.Thoat");
                System.out.println("Vui long chon chuc nang:");
                c = new Scanner(System.in).nextInt();
                switch (c) {
                case 1:
                    qlmonhoc.Nhapdanhsach();
                    break;
                case 2:
                    qlmonhoc.Xuatdanhsach();
                    break;
                case 3:
                    qlmonhoc.Sapxep();
                    System.out.println("danh sach sau khi sap xep");
                    qlmonhoc.Xuatdanhsach();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("khong co chuc nang do vui long chon lai");
                    
            }
        }
        
        
        
    }
    
}
