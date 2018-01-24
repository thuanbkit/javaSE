/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmonhoc;

/**
 *
 * @author Adminis
 */
public class QLMonHoc {

    private MonHoc[] mh = new MonHoc[5];

    public QLMonHoc() {
    }

    public void Nhapdanhsach() {
        System.out.println("Nhap danh sach mon hoc");
        for (int i = 0; i < mh.length; i++) {
            System.out.println("mon hoc " + i + ":");
            MonHoc monhoc = new MonHoc();
            monhoc.nhap();
            mh[i] = monhoc;
        }
    }

    public void Xuatdanhsach() {
        for (MonHoc mhoc : mh) {
            mhoc.xuat();
        }
    }

    public void Sapxep() {
        for (int i = 0; i < mh.length; i++) {
            for (int j = i + 1; j < mh.length; j++) {
                if (mh[i].sosanh(mh[j]) == MonHoc.LON_HON) {
                    MonHoc trunggian = mh[i];
                    mh[i] = mh[j];
                    mh[j] = trunggian;
                }
            }
        }
    }
}
