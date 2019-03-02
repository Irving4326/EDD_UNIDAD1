
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        Scanner xd = new Scanner ( System.in);
        System.out.println("Cuantos grupos son:" );
        x = xd.nextInt();
        xd.nextLine();
        System.out.println("");
        System.out.println("Cuantos alumnos son:");
        y= xd.nextInt();
        xd.nextLine();
        
        Alumno [][] fil = new Alumno[x][y];
        
        
        for (int i = 0; i <fil.length; i++) {
            
            
            for (int j = 0; j < fil[i].length; j++) {
                fil[i][j] = new Alumno();
                System.out.println("Nombre: ");
                fil[i][j].setNom(xd.nextLine());
                
                System.out.println("Edad:");
                fil[i][j].setEdad(xd.nextInt());
                xd.nextLine();
            }
        }
        
        for (int i = 0; i <fil.length; i++) {
            
            
            for (int j = 0; j < fil[i].length; j++) {
                System.out.println("");
                System.out.println("Nombre de la persona:" +fil[i][j].getNom());
                System.out.println("Edad de la perona: " +fil[i][j].getEdad());
            }
        }
        
        
        
    }
    
}

class Alumno{
private String nom;
private int edad;

    public Alumno() {
        nom="El bryan";
        edad = 18;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}