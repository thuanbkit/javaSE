/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosocket;

import static demosocket.Server.socket;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adminis
 */
public class Client {

    static Socket socket = null;
    static BufferedReader bis = null;
    static BufferedWriter bos = null;

    public static void main(String[] args) {

        try {
            System.out.println("dang ket noi den client...");
            socket = new Socket("localhost", 6969);
            System.out.println("ket noi dc server");
            // chi can quan tam den socket
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        while (true) {
                            String s = bis.readLine();
                            System.out.println("Server:" + s);
                        }

                    } catch (IOException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            bis.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }).start();

            bos = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
                System.out.println("Me:");
                String str = new Scanner(System.in).nextLine();
                bos.write(str);
                bos.newLine();
                bos.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bos.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
