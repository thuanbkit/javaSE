/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosocket;

import static demosocket.Client.socket;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
public class Server {

    static BufferedWriter bos = null;
    static Socket socket = null;
    static BufferedReader bis = null;

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(6969);
            System.out.println("dang cho ket noi");
            socket = serverSocket.accept();
            // y nghia lenh nay
            // mở cổng và chờ client kết nối
            // dừng mọi xử lý của thread này và chờ client kết nối
            // khi có client kết nối tới thì trả về 1 socket và chạy tiếp
            System.out.println("Da ket noi");
            // chi quan tam den socket
            // từ server gửi data cho client
            // 2 thang da ket noi voi nhau gi ta chi lam viec voi socket 2 dau
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        while (true) {
                            String s = bis.readLine();
                            if(s != null) {
                                System.out.println("Client:" + s);
                            }
                            
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            bis.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }).start();

            bos = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
                System.out.print("Me:");
                String str = new Scanner(System.in).nextLine();
                bos.write(str);
                bos.newLine();
                bos.flush();
            }

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bos.close();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
