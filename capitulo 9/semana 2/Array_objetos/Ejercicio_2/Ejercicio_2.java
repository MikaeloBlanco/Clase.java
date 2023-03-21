package Array_objetos.Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[]  args){
        //Variables del main para introducción de datos
        int tam;
        Scanner s = new Scanner(System.in);
        tam = 4;
        Gato[] gato = new Gato[tam]; 
        int i;
        //Array de objetos gato definidos
        gato[0] = new Gato("Mishifu","Rojo", "Normal");
        gato[1] = new Gato("Pan", "Naranja", "Normal");
        gato[2] = new Gato("Ramses", "Rosa", "Egipcio");
        gato[3] = new Gato("Melanea", "Blanco", "Siames");
        //Obtenedor de datos del objeto gato en un array
        System.out.println("\nDatos de los gatos: ");
        for(i = 0; i < 4; i++){
            System.out.println("\nGato nº " + (i + 1));
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Color: " + gato[i].getColor());
            System.out.println("Raza: " + gato[i].getRaza());
        }
        //Prueba introdución función comeSardinas
        System.out.print("Introduce las sardinas que come el gato: ");
        i = s.nextInt();
        gato[0].comeSardinas(i);
        System.out.print("Introduce ahora las sardinas que le quieres dar al siguiente gato: ");
        i = s.nextInt();
        gato[1].comeSardinas(i);
        System.out.print("Introduce por ultimo lo que quieres que coma el ultimo gato: ");
        i = s.nextInt();
        gato[2].comeSardinas(i);
    }
}


