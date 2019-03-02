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
        System.out.println("Practica 2: ");
         System.out.println(" ");
        int mat [][] = new int [10][10]; 
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
               
                mat[i][j]=0;
                 if(i==j){
                mat[i][j]=1;
                }
            }
        }
                for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                 
                System.out.print("["  + mat[i][j]  + "]"); 
                
            }
                    System.out.println("");
            }
    }
    
}
