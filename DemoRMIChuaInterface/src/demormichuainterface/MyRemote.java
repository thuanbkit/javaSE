/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormichuainterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author thuandd
 * muốn gọi được từ xa thì phải extend từ class remote
 */
public interface MyRemote  extends Remote{
    int tinhtong(int a ,int b) throws RemoteException;
}
