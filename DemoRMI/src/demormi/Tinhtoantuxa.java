/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi;

import demormichuainterface.MyRemote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author thuandd
 * de danh dau object cua class Tinhtoantuxa dua ra duoc cong thi ta extend UnicastRemoteObject
 * va viet lai contructor throws RemoteException
 */
public class Tinhtoantuxa extends UnicastRemoteObject implements MyRemote{
    public Tinhtoantuxa() throws RemoteException {
        super();
    }
    @Override
    public int tinhtong(int a, int b) throws RemoteException {
        System.out.println("dang goi ham tinh tong");
        return a+b;
    }
    
}
