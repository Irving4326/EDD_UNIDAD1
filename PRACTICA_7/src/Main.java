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
        System.out.println(""); 
                      System.out.println("Practica 7: ");
                      System.out.println(" ");
                      System.out.println("Ordenar");
                      int []pema = new int [50];
                      for (int i = 0; i < pema.length; i++) {
                      pema[i]= (int)(Math.random() *100 +1);
                      }
                      
                      
                        int temporal = 0;

                     for (int i = 0; i < pema.length; i++) {
                     for (int j = 1; j < (pema.length); j++) {
                     if (pema[j - 1] > pema[j]) {
                       temporal = pema[j - 1];
                       pema[j - 1] = pema[j];
                       pema[j] = temporal;
                                                }
                                                                 }
                                                            }
    
                        for (int i = 0; i < pema.length; i++) {
                        System.out.println("posicion" +i + "= " + "[" +pema[i] +"]");
                        }

    }
    
}
