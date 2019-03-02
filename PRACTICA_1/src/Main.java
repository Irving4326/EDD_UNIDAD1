
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
        int a;
        int rep=0;
        double moda=0;
          double media,sumat,vara=0,desvi;
        Scanner xd = new Scanner (System.in);
        System.out.println("Dame la cantidad de edades:");
        a = xd.nextInt();
        xd.nextLine();
        
         double cap [] = new double[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese la edad");
            cap [i] = xd.nextDouble();
            
        }
        for (int i = 0; i <cap.length; i++) {
            int repet = 0;
            for (int j = 0; j <cap.length; j++) {
                if( cap[i]==cap[j]){
                repet++;
                } 
                if(repet>rep){
                moda = cap[i];
                rep = repet;
                }
            }
        }
        System.out.println("");
            System.out.println("La moda es: " +moda);
        //Media
        double s =0;
        for (double d : cap) {
            s =s+d;
        }
        media = s / a;
        System.out.println("La media es: "  +media);
        
        for (int i = 0; i < a; i++) {
            sumat = Math.pow(cap[i] - media,2);
            vara = vara + sumat;
        }
        vara = vara/ (a-1);
        
        
        //Desviación estándar
        
        desvi = Math.sqrt(vara);
        double yolo =Math.rint(desvi*100)/100;
        System.out.println("La desviacion estandar es: " + yolo);
    }
    
}
