/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]aiMatriz = new int [3][3]; 
        // TODO code application logic here
        for (int i = 0; i < aiMatriz.length; i++) { //FOR    Filas
            for (int j = 0; j < aiMatriz[i].length; j++) { //FOR ANIDADO  Columnas 
                aiMatriz[i][j]= (int)(Math.random() *100 +1 );
            }
        }
        for (int i = 0; i < aiMatriz.length; i++) { //FOR    Filas
           
            for (int j = 0; j < aiMatriz[i].length; j++) { //FOR ANIDADO  Columnas 
                System.out.print("[" + aiMatriz[i][j] + "]");
                
            }
            System.out.println("");
        }
       
    }
    
}
