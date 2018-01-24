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
public class BaiTap {
    public int so;
    public static BaiTap instance;
    public static BaiTap instance() {
        if(instance == null) {
            instance = new BaiTap();
        }
        return instance;
    }
    private BaiTap() {
    }

}
