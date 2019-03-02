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
        //Paso por valor--> Se manda una copia del valor 
        //Paso por referencia --> Se manda una direccion de memoria
        //Java solo maneja paso por valor
        // Se puede modificar los arreglos y objetos porque se crea una copia de la direccion
        int [ ] aiArreglo = new int [100];
        llenar(aiArreglo);                 
        imprimir(aiArreglo);
        int iVal = 10;
        System.out.println("\niVal = " + iVal);
        incrementa(iVal);
        System.out.println("iVal =" + iVal );
    }
    
    public static void llenar(int[] aiArre){
    
        
        for( int i = 0; i < aiArre.length; i++ ){  //Lenght es nada mas de lectura
         aiArre[i] = (int)((Math.random() * 100) +1);

        }
    
    }
    public static void imprimir(int[] aiArre){
        
        for (int aiDato :  aiArre) {
            System.out.print("[" + aiDato + "]");
        }
         
    }
    public static void incrementa( int i ){
    i++;
    }
    
}
