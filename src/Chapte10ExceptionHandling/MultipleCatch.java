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
public class MultipleCatch {

    public static void main(String[] args) {
        try {
            int a = 0, b = 0;
            int c = a / b;
            System.out.println("c = " + c);
            int ar[] = new int[10];
            ar[10] = 10;
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index out of bound.");
        }
    }

}
