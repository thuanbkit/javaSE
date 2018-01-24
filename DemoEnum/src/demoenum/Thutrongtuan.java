/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoenum;

/**
 *
 * @author Adminis
 */
public enum Thutrongtuan {
    ThuHai(1,"Thu 2","Monday"),ThuBa(2,"Thu 3","Tueday"),ThuTu(3,"thu 4","Thurday"),Thunam(4,"thu nam","abc");
    private int ma;
    private String lbViet;
    private String lbAnh;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getLbViet() {
        return lbViet;
    }

    public void setLbViet(String lbViet) {
        this.lbViet = lbViet;
    }

    public String getLbAnh() {
        return lbAnh;
    }

    public void setLbAnh(String lbAnh) {
        this.lbAnh = lbAnh;
    }

    private Thutrongtuan(int ma, String lbViet, String lbAnh) {
        System.out.println("abc"+ma);
        this.ma = ma;
        this.lbViet = lbViet;
        this.lbAnh = lbAnh;
    }
    
}
