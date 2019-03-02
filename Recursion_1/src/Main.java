
import java.util.Scanner;

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
         String y;
          int x;
        Scanner xd = new Scanner (System .in );
        System.out.println("Introduce un numero: ");
        x = xd.nextInt();
        xd.nextLine();
        
        System.out.println("La suma de " +x +  " --> "  + sumach(x));
        
        System.out.println("");
    }
    private static int sumach(int iVal){
        // int x=0  y=0
        //  x = iVal /10  
        //  y =  iVal%10
        // 120/ 12  =  12   ????
        // Todo puede hacerse en una sola variable 
        //No puede ser negativo 
        if(iVal <=  0){
         return 0;
         
        }else {
            
        return sumach(iVal/10) + iVal%10;
        
        }
 
    }
}
