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
public class DemoEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thutrongtuan thu1= Thutrongtuan.ThuBa;
        // enum co the dung switch
        switch (thu1) {
            case ThuBa:
                
                break;
            case ThuHai:
                
                break;
            case ThuTu:
                
                break;
            case Thunam:
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
