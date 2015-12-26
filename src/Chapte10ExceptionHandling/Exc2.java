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
public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed .");
        } catch (Exception e) {
            System.out.println("Division by zero.");
        }
        System.out.println("After  catch statement.");
    }
    
}
