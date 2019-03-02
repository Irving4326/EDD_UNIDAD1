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
        
        Primo pNum = new Primo();
        pNum.setNumero(7);
        pNum.esPrimo();
        
        Primo pNum2 = new Primo(7000);
        pNum2.esPrimo();
        
    }
    
}
class Primo{ //Default

    private int numero; 

    public Primo() {
    }

    
    
    public Primo(int numero) {
        this.numero = numero;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void esPrimo(){
     String sMensaje = numero + " " + "Es primo";
        for (int i = 2; i < numero;i++) {
            if((numero % i) == 0){  // No es primo
                
               sMensaje= numero + " " + "No es primo"; 
            break;
            }
        }
        System.out.println(sMensaje);
    }
    
}
