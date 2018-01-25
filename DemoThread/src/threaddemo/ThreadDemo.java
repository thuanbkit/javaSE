/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thuandd
 */
public class ThreadDemo {

    public static Data dataShare;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ThreadB b = new ThreadB();
//        b.start();
        dataShare = new Data();
        dataShare.setLaCo(1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (dataShare) {
                    for (int i = 0; i < 4; i++) {
                        try {
                            if (dataShare.getLaCo() == 1) {
                                int a = new Random().nextInt(100);
                                dataShare.setA(a);
                                System.out.println("a=" + a);
                                Thread.sleep(90);
                                dataShare.setLaCo(2);
                                dataShare.notifyAll();
                            } else {
                                dataShare.wait();
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (dataShare) {
                    for (int j = 0; j < 4; j++) {
                        try {
                            if (dataShare.getLaCo() == 2) {
                                int b = new Random().nextInt(100);
                                dataShare.setB(b);
                                System.out.println("b=" + b);
                                Thread.sleep(90);
                                dataShare.setLaCo(3);
                                dataShare.notifyAll();
                            } else {
                                dataShare.wait();
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (dataShare) {
                    for (int k = 0; k < 4; k++) {
                        try {
                            if (dataShare.getLaCo() == 3) {
                                int c = dataShare.tinhtong();
                                System.out.println("Tong=" + c);
                                Thread.sleep(90);
                                dataShare.setLaCo(1);
                                dataShare.notifyAll();
                            } else {
                                dataShare.wait();
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }).start();

    }

}
