
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
         Scanner xd = new Scanner (System .in );
         int num,pot;
        System.out.println("Dame el numero");
        num = xd.nextInt();
        xd.nextLine();
        System.out.println("Dame la potencia ");
        pot = xd.nextInt();
        xd.nextLine();
        System.out.println("La potencia de: " + num + " es " + pot(num , pot));
    }
    
    
     public static int pot (int iVal, int iVol){
        
        
   if(iVol <=0){
   return 1;
   }else{
   return iVal * pot(iVal, iVol-1);
   }
   
}
    
}
