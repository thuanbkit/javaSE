/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoexception;

import java.util.Scanner;

/**
 *
 * @author thuandd
 */
public class DemoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        System.out.println("a = ");
        a = new Scanner(System.in).nextInt();
        System.out.println("b = ");
        b = new Scanner(System.in).nextInt();
        try {
            c= a/b;
            System.out.println("c="+c);
        } catch (ArithmeticException e) {
            System.out.println("error " + e.getMessage());
        }
        
        
    }
    
}
