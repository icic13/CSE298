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
public class TryCatch {
    public static void main(String[] args) {
        try{
          int a = 0 , b = 0;
        int c = a/b;
        System.out.println("c = "+c);
        }
        catch (Exception ex) {
            System.out.println("Division by zero not possible.");
        }
    }
    
}
