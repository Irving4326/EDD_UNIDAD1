
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Introduce un nùmero");
        int iNum = sCaptu.nextInt();
       /*for (int i = iNum; i >= 1; i--) {
            System.out.println(i + "-");
        }*/
       recursiveDown(iNum);
        System.out.println(" ");
        recursiveup(iNum, 1);
    }
    public static void recursiveDown(int iVal){
    /*Dos caracteristicas:
        1:LLamada recursiva: El metodo debe llamarse a si mismo
        2. Detenerse: El mètodo debe proporcionar maneras para detener la recursiòn
        */
        System.out.print(iVal );
        if(iVal>1){
             System.out.print(" - ");
            recursiveDown(iVal -1);
        }
        
        
    }
    public static void recursiveup(int iVal, int iCont){
    
        System.out.print(iCont);
        
        if(iCont<iVal){
            System.out.print(" - ");
            recursiveup(iVal , iCont +1);
        }
        
        
    }
    
}
