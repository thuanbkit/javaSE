/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

/**
 *
 * @author thuandd
 */
public class Test {

    public static void main(String[] args) {
        BaiTap bt = BaiTap.instance();
        bt.so = 10;
        System.out.println("objec 1:" + bt.so);
        BaiTap bt2 = BaiTap.instance();
        System.out.println("objec 2:" + bt2.so);
    }

}
