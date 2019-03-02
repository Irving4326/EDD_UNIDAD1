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
        //Funciones
        // Stack -- > LIFO PILA
        //LIFO -->  Last in first out
        // FIFO --> First in first out
        System.out.println("Inicio main");
        A();
        System.out.println("Fin main");
    }
    
    public static void A(){
    System.out.println("Inicio A");
    B();
        System.out.println("Fin A");
    }
    
     public static void B(){
    System.out.println("Inicio B");
    C();
    // int iResu = 1/0;
        System.out.println("Fin B");
    }
      public static void C(){
    System.out.println("Inicio C");
        System.out.println("Fin C");
    }
}
