/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rana
 */
public class FinallyDemo {

    /**
     * @param args the command line arguments
     */
    static void procA(){
        try{
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("procA's finally.");
            
        }
    }
        static void procB(){
        try{
            System.out.println("inside procB");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("procB's finally.");
            
        }
    }
            static void procC(){
        try{
            System.out.println("inside procC");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("procC's finally.");
            
        }
    }
    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception Caught.");
        }
        procB();
        procC();
    }
    
}