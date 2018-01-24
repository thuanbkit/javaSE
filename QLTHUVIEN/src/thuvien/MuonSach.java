/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvien;

/**
 *
 * @author Adminis
 */
public class MuonSach {
    public static final int SO_NGAY_MUON = 5;
    private Sach sachmuon;
    private BanDoc nguoimuon;
    private Thoigian ngaymuon;
    private Thoigian ngaytra;
    private int quahan;

    public Sach getSachmuon() {
        return sachmuon;
    }

    public BanDoc getNguoimuon() {
        return nguoimuon;
    }

    public Thoigian getNgaymuon() {
        return ngaymuon;
    }

    public Thoigian getNgaytra() {
        return ngaytra;
    }

    public int isQuahan() {
        return quahan;
    }

    public void setSachmuon(Sach sachmuon) {
        this.sachmuon = sachmuon;
    }

    public void setNguoimuon(BanDoc nguoimuon) {
        this.nguoimuon = nguoimuon;
    }

    public void setNgaymuon(Thoigian ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public void setNgaytra(Thoigian ngaytra) {
        this.ngaytra = ngaytra;
    }

    public void setQuahan(int quahan) {
        this.quahan = quahan;
    }
    public void nhap() {
        
    }
    public void hien() {
        this.nguoimuon.in();
        this.sachmuon.in();
    }
    public void traSach(Thoigian hientai) {
        System.out.println("ngay tra ?");
        this.setNgaytra(hientai);
        this.setQuahan(this.ngaytra.diffDays(this.ngaymuon) - SO_NGAY_MUON);
        
    }
}
