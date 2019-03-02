
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irivng Gerardo Mancera Mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Maximo comun divisor xd    180//48
        int x,y;
        Scanner xd = new Scanner(System.in);
        System.out.println("Introduce dos numeros ");
        x = xd.nextInt();
        xd.nextLine();
        y=xd.nextInt();
        xd.nextLine();
        System.out.println("Maximo comun divisor (" + x  + " " + " " + y + ")  ->   " + GG ( x , y ));
        
    }
    public static int GG (int iVal, int iVol){
    if ( iVol ==0 )
        return iVal;
    else 
        return 
                GG(iVol, iVal % iVol);
   
    
    }
  

    
}
