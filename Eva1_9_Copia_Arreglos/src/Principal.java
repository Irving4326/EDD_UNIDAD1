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
        int [ ] aiArreglo = new int [100];
        llenar(aiArreglo);                 
        imprimir(aiArreglo);
        System.out.println("");
        //Crear una copia
        //int[] aiCopia = aiArreglo; //No funciona        
        int[] aiCopia = new int[100];
        //Leer elemento por elemento y copiar
        for (int i = 0; i < aiArreglo.length; i++) {
            aiCopia[i]= aiArreglo[i];
        }
        //Modificamos
        System.out.println("");
        imprimir(aiCopia);
        System.out.println("");
        aiArreglo[1]=100;
        imprimir(aiCopia);
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
    
    
}
