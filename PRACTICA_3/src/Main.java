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
        System.out.println("Practica 3: ");
         System.out.println(" ");
            int mat1[][] = new int [5][5] ;
            int mat1copa[][] = new int [5][5] ;
            for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j]= (int)(Math.random() * 100 +1);
            }
            }
        
        
            for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                 System.out.print("["  + mat1[i][j]  + "]");    //Impriremos el original
            }
            System.out.println("");
            }

             System.out.println("Copia");
        
            for (int i = 0; i <mat1copa.length; i++) {
            for (int j = 0; j < mat1copa[i].length; j++) {
                mat1copa[i][j] = mat1[i][j];
            }
            }
        
            for (int i = 0; i < mat1copa.length; i++) {
            for (int j = 0; j < mat1copa[i].length; j++) {
                  System.out.print("["  + mat1copa[i][j]  + "]");        //Impriremos la copia
            }
            System.out.println("");
            }
 
        
            System.out.println("");
    
             for (int i = 5-1; i >= 0; i--) {
             for (int j = 5-1; j >= 0; j--) {        
                  System.out.print("["  + mat1copa[i][j]  + "]");        //Impriremos la copia  inversa
            }
            System.out.println("");
            }
    }
    
}
