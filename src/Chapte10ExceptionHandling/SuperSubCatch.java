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
public class SuperSubCatch {

    public static void main(String[] args) {
        try {

            int a = 0;
            int b = 42 / a;
            
        } catch (Exception e) {
            System.out.println("Generic Exception catch: ");
        }
       // catch (ArithmeticException ) {
//            System.out.println("Error.");
            
//        }

    }
}
