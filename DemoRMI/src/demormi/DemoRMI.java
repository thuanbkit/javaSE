/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thuandd
 */
public class DemoRMI {

    /**
     * @param args the command line arguments b0: tao interface b1: tạo class
     * b2: tạo object b3: đưa object ra cổng
     */
    // goi ham tu xa nghia la
    // ham day nam tren 1 may tinh khac tam goi la server
    // va minh goi cai ham day chay,no chay o chinh máy đấy được kết quả gì nó trả về cho mình
    // tat ca nhung gi lam duoc socket thi deu lam duoc tu RMI
    // lam sao client biet tren server co ham gi ma goi: tren client cung co 1 interface chung cho ca 2 thang
    // tren server implement interface
    // lam sao tạo interface? copy code thì có chung interface ? không,trong cùng 1 project build 2 lần khác nhau
    // đã tạo ra 2 interface khác nhau huống hồ đây là 2 project khác nhau.vậy phải làm thế nào?
    // buil 1 lần vào copy file jar sang cả 2 project,net bean hỗ trợ 1 cách hay là add project
    // tren server sẽ tạo class implement interface
    // sau do tao object đưa object ra cổng
    // trong cong nghe RMI ham tinh tong chay tren server
    public static void main(String[] args) {
        try {

            Tinhtoantuxa tttx = new Tinhtoantuxa();
            // dang ky cong cong mac dinh RMI trong may la 1099
            LocateRegistry.createRegistry(1099);
            // dua ra cong, thi phai co đường dẫn 
            //rebind la khi co client goi den thanh cong thi lai dua ra cong
            // bind chi dua 1 lan
            // dua object nay ra cong va lang nghe o duong dan nay
            Naming.rebind("rmi://localhost/tinhtoan", tttx);
            System.out.println("dang goi client goi ham");
            
        } catch (RemoteException ex) {
            Logger.getLogger(DemoRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoRMI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
