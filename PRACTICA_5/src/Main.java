/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author escritorio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Practica 5: ");
         System.out.println(" ");
          int [] arr = new int [100];
         
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ( int ) ( Math.random() *100 +1);
        }
                      for (int i = 0; i < arr.length; i++) {
                          System.out.print("[" + arr[i] + "]");  //Orignial
        }
                      
                      System.out.println("");
                      
                      
                      for (int i = 0; i < arr.length; i++) {
                          
                          if (arr[i]%2==0) {
                              
                              System.out.print("[" + arr[i] +"]");     //Impares
                          }
        }
    }
    
}
