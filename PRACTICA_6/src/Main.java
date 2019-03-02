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
         int con1=0,con2=0;
                      System.out.println("");
                      System.out.println("Practica 6 ");
                      System.out.println("");
                      int [] t = new int [50];
                      for (int i = 0; i < t.length; i++) {
                      t[i] = ( int ) ( Math.random() * 100 +1);
                                                         }
                      System.out.println("Original");
                      
                      for (int i = 0; i < t.length; i++) {
                          
                          System.out.print("[" + t[i] + "]");  //Orignial
                                                         }
                      
                      System.out.println("");
                      
                      System.out.println("Pares");
                      for (int i = 0; i < t.length; i++) {
                          if (t[i]%2==0) {
                             con1 = con1 +1;
                              
                              System.out.print("[" + t[i] +"]");     //Pares
                              
                          }
                          }

  
                      System.out.println("");
                      System.out.println("Impares");
                      for (int i = 0; i < t.length; i++) {
                          if (t[i]%2!=0) {
                              con2 = con2 +1;                             
                              System.out.print("[" + t[i] +"]");     //Impares
                          }
                          }
    }
    
}
