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
        
        Principal pObj1 = new Principal();
        Principal pObj2 = new Principal();
        
        System.out.println(pObj1);
        System.out.println(pObj2);
        
        Principal pCopia = pObj1;
        System.out.println(pCopia);
        
        pObj1 = null;
        pObj2 = null;
        
        System.out.println(pObj1);
        System.out.println(pObj2);
        System.out.println(pCopia);
        //Garbage collector --> se encarga de eliminar la memoria
        
        
        
    }
    
}
