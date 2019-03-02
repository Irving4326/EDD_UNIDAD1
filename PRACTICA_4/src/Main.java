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
        System.out.println("Practica 4: ");
         System.out.println(" ");
        double matdo1 [][] = new double[5][5];
        double matdoresu [][] = new double[5][5];
        double matdo2 [][] = new double[5][5];
        
         for (int i = 0; i < matdo1.length; i++) {
            for (int j = 0; j < matdo1[i].length; j++) {
                matdo1[i][j]= (double)( Math.random()*10 +1);
            }
            }
        for (int i = 0; i < matdo2.length; i++) {
            for (int j = 0; j < matdo2[i].length; j++) {
                matdo2[i][j]= (double)( Math.random()*10 +1);
            }
            }
        for (int i = 0; i < matdoresu.length; i++) {
            for (int j = 0; j < matdoresu[i].length; j++) {
                matdoresu[i][j]= matdo1[i][j]*matdo2[i][j];
            }
            }
        
        System.out.println("");
         for (int i = 0; i < matdo1.length; i++) {
            for (int j = 0; j < matdo1[i].length; j++) {
                 System.out.print("["  + matdo1[i][j]  + "]");    //Imprimiremos la mat 1
            }
            System.out.println("");
            }
          System.out.println("");
         for (int i = 0; i < matdo2.length; i++) {
            for (int j = 0; j < matdo2[i].length; j++) {
                 System.out.print("["  + matdo2[i][j]  + "]");    //Imprimiremos la mat 2
            }
            System.out.println("");
            }
         
         
         
        System.out.println("Resultados");
        System.out.println("");
         for (int i = 0; i < matdoresu.length; i++) {
            for (int j = 0; j < matdoresu[i].length; j++) {
                 System.out.print("["  + matdoresu[i][j]  + "]");    //Imprimiremos el resultado
            }
            System.out.println("");
            }
    }
    
}
