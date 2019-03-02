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
        // TODO code application logic here
        int [][][][][] aiArreextrem = new int [5][5][5][5][5];
        for (int i = 0; i < aiArreextrem.length; i++) {
            for (int j = 0; j < aiArreextrem[i].length; j++) {
                for (int k = 0; k < aiArreextrem[i][j].length; k++) {
                    for (int l = 0; l < aiArreextrem[i][j][k].length; l++) {
                        for (int m = 0; m < aiArreextrem[i][j][k][l].length; m++) {
                            aiArreextrem[i][j][k][l][m] = (int)(Math.random() *100 +1);
                        }
                    }
                }
            }
        }
        
        
        for (int i = 0; i < aiArreextrem.length; i++) {
            for (int j = 0; j < aiArreextrem[i].length; j++) {
                for (int k = 0; k < aiArreextrem[i][j].length; k++) {
                    for (int l = 0; l < aiArreextrem[i][j][k].length; l++) {
                        for (int m = 0; m < aiArreextrem[i][j][k][l].length; m++) {
                            System.out.print("["+ aiArreextrem[i][j][k][l][m] +"]");
                        }
                         System.out.println("");
                    }
                     System.out.println("");
                }
                 System.out.println("");
            }
            System.out.println("");
        }
        
        
    }
    
}
