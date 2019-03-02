/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] aiarre = new int [3][];
        aiarre[0] = new int [15];
        aiarre[1] = new int [3];
        aiarre[2] = new int [100];
        System.out.println(aiarre);
        System.out.println(aiarre[0]);
        System.out.println(aiarre[1]);
        System.out.println(aiarre[2]);
        System.out.println(aiarre[0][0]);
        
        for (int i = 0; i < aiarre.length; i++) {
            for (int j = 0; j < aiarre[i].length; j++) {
                aiarre[i][j] = (int)(Math.random()  *100 +1);
            }
        }
        for (int[] aiarre1 : aiarre) {   //Arreglo
            for (int b : aiarre1) {   //Entero
                System.out.print("[" + b + "]");
            }
            System.out.println("");
        }
        
    }
    
}
