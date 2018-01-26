/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormiclient;

import demormichuainterface.MyRemote;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thuandd
 */
public class DemoRMIClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // ket noi toi di chi server va đúng đường dẫn của object remote
            // lay ve 1 object,ep kieu ve interface tuong ung
            // goi ham
            // link rmi://localhost/tinhtoan cung duoc do dung rmi cong la 1099
            // lookup la anh cua object tren server
            Remote lookup = Naming.lookup("rmi://localhost:1099/tinhtoan"); 
            MyRemote myRemote = (MyRemote) lookup;
            int tong = myRemote.tinhtong(1, 3);
            System.out.println("Tong: " + tong);
        } catch (NotBoundException ex) {
            Logger.getLogger(DemoRMIClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoRMIClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(DemoRMIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
