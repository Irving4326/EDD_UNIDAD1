/*
 * Arreglo con 100 numeros aleatorios
 * Imprimir direccion de memoria y los elementos del arreglo
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
        int aiArreglo[] = new int[100]; //Arreglo de 100 enteros 
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)(1+Math.random()*100);
        }
        System.out.println(aiArreglo); 
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.print("[" + aiArreglo[i] + "]");
        }
        
        /*
        aiArreglo = new int[50];
        System.out.println("\n" + aiArreglo);
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.print("[" + aiArreglo[i] + "]");
            
        }*/      
        //Creacion de la copia del arreglo
        int[] aiCopia = aiArreglo;
        //Mostrar las direcciones de memoria
        System.out.println("");
        System.out.println("aiArreglo = " + aiArreglo);
        System.out.println("aiCopia = " + aiCopia);
        
        
        //Nueva dimension del arreglo
        aiArreglo = new int[50];
        System.out.println("\n" + aiArreglo); //Mostrar direccion
        //Mostrar elementos del arreglo original luego de cambiar el tamaño
        System.out.println("IMPRIMIENDO DATOS");
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.print("[" + aiArreglo[i] + "]");
        }
        //Mostrar elementos de la copia
        System.out.println("\nIMPRIMIENDO COPIA");
        for (int i : aiCopia) {
            System.out.print("[" + i + "]");
        }
    }
    
}
