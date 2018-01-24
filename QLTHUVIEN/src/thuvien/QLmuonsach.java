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
public class QLmuonsach {

    public int index_muonsach = 0;
    public Sach[] dsSach = new Sach[5];
    public BanDoc[] dsBandoc = new BanDoc[5];
    public MuonSach[] dsMuonsach = new MuonSach[5];

    public void NhapdsSach() {
        for (int i = 0; i < dsSach.length; i++) {
            dsSach[i] = new Sach();
            dsSach[i].nhap();
        }
    }

    public void NhapdsBanDoc() {
        for (int i = 0; i < dsBandoc.length; i++) {
            dsBandoc[i] = new BanDoc();
            dsBandoc[i].nhap();
        }
    }

    public void choMuon() {
        BanDoc nguoimuon;
        Sach sach;
        System.out.println("Nguoi muon(Nhap ma):");
        for (BanDoc bandoc : dsBandoc) {
            bandoc.in();
        }
        while (true) {
            String input_bandoc = new Scanner(System.in).nextLine();
            // cho nay co the kiem tra nguoi nay da muon sach qua han chua
            nguoimuon = findBandoc(input_bandoc);
            if (nguoimuon != null) {
                break;
            }
        }

        System.out.println("Chon sach(Nhap ma):");
        for (Sach sach2 : dsSach) {
            sach2.in();
        }
        while (true) {
            String input_masach = new Scanner(System.in).nextLine();
            // cho nay co the kiem tra xem sach nay da ai muon chua
            sach = findSach(input_masach);
            if(sach != null) {
                break;
            }
        }
        dsMuonsach[index_muonsach] = new MuonSach();
        dsMuonsach[index_muonsach].setNguoimuon(nguoimuon);
        dsMuonsach[index_muonsach].setSachmuon(sach);
        index_muonsach++;
    }

    public void traSach() {
        
    }

    public BanDoc findBandoc(String ma) {
        BanDoc banDoc = null;
        for (BanDoc bandoc : dsBandoc) {
            if (ma.equals(bandoc.getMa())) {
                return bandoc;
            }
        }
        return banDoc;
    }

    public Sach findSach(String ma) {
        Sach sachF = null;
        for (Sach sach : dsSach) {
            if (ma.equals(sach.getMa())) {
                return sach;
            }
        }
        return sachF;
    }
}
