
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sCaptu = new Scanner (System.in);
        System.out.println("Introduce un valor: ");
        int iNum = sCaptu.nextInt();
        sCaptu.nextLine();
        System.out.println("Factorial (" + iNum + ")  ->   " +factorial(iNum));
        
        System.out.println("Factorial (" + iNum + ")  ->   " +factorialRecu(iNum));
        
    }
    public static int factorial (int iVal){
        
    int iResu = 1;
    
        for (int i = 1; i <= iVal ; i++) {
            iResu=  iResu * i;
        }
        return iResu;
        
        
    }
    public static int factorialRecu (int iVal){
        
        if(iVal ==0)
        
            return 1;
        else 
            return iVal * factorial( iVal - 1);
        
    }
    
    //Maximo comun divisor
    
    
            
}
