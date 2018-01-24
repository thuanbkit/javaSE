/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoContro;

/**
 *
 * @author thuandd
 * trong java object nhu mot con tro java dùng khái niệm referent
 *  biến là 1 ô nhớ,khi khai báo 1 biến lập tức máy dùng 1 ô nhớ lưu giá trị
 * biến thì có vị trí(địa chỉ)
 * khi gán tương đương cho mh1 và mh2 cùng trỏ đến 1 địa chỉ
 * trong java có vùng nhớ tĩnh(chứa class),vùng nhớ heap (chứa object)
 * Monhoc mh1; moi chi khai bao con tro chưa tạo vùng nhớ
 * nhưng dư lượng nguyên thủy k bao h là con trỏ
 * tham chiếu,tham trị
 */
public class Demo {
    public static void main(String[] args) {
        Monhoc mh1;
        mh1 = new Monhoc();
        System.out.println("con tro" + mh1.toString());
        mh1.monhoc ="abc";
        mh1.sotrinh = 5;
        Monhoc mh2 = mh1;
        mh1.sotrinh = 6;
        System.out.println("monhoc mh1:" + mh1.monhoc);
        System.out.println("monhoc mh1:" + mh1.sotrinh);
        System.out.println("monhoc mh2:" + mh2.monhoc);
        System.out.println("monhoc mh2:" + mh2.sotrinh);
    }
   
}
