package Array_objetos.Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[]  args){

        int tam;
        Scanner s = new Scanner(System.in);
        tam = 4;
        Gato[] gato = new Gato[tam]; 
        int i;
        System.out.println("Introduzca los datos de los gatos que desee crear");
        for(i = 0; i < 4; i++){

            gato[i] = new Gato();
            System.out.println("\nGato nº " + (i + 1));
            System.out.print("Nombre: ");
            gato[i].setNombre(s.next());
            System.out.print("Color: ");
            gato[i].setColor(s.next());
            System.out.print("Raza: ");
            gato[i].setRaza(s.next());

        }
        System.out.println("\nDatos de los gatos: ");
        for(i = 0; i < 4; i++){
            System.out.println("\nGato nº " + (i + 1));
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Color: " + gato[i].getColor());
            System.out.println("Raza: " + gato[i].getRaza());
        }

    }
}
