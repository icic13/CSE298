/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapte10ExceptionHandling;

/**
 *
 * @author rana
 */
public class ThrowDemo {

    /**
     * @param args the command line arguments
     */
    public static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("caught inside.");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught : "+e);
        }
    }
    
}
