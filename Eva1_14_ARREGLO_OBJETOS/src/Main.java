
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irivng Gerardo Mancera Mejia 18550317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        personas [] apDatos = new personas[5];
        //int []aiDatos = new int[5];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < apDatos.length; i++) {
            apDatos[i]= new personas();
            System.out.println("Nombre:");
            apDatos[i].setNombre(sCaptu.nextLine());
            System.out.println("Apellido:");
            apDatos[i].setApellido(sCaptu.nextLine());
            System.out.println("Edad:");
            apDatos[i].setEdad(sCaptu.nextInt());
            sCaptu.nextLine();
            System.out.println("Nacionalidad:" );
            apDatos[i].setNacionalidad(sCaptu.nextLine());
        }
        for (personas apDato : apDatos) {
            System.out.println("");
            System.out.println("Datos de la persona:");
            System.out.println("Nombre de la personita: "  +apDato.getNombre());
            System.out.println("Apellido de la persona: " +apDato.getApellido());
            System.out.println("Edad de la persona: " +apDato.getEdad());
            System.out.println("Nacionalidad: " +apDato.getNacionalidad());
            System.out.println("_____________________");
        }
        
    }
    
    
}
class personas{
    private String nombre, apellido;
    private int edad;
    private String nacionalidad;

    public personas() {   // Default con sus datos
        nombre ="Irving";
        apellido="Mancera";
        edad=19;
        nacionalidad= "Mexicana";
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    

}