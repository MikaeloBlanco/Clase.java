import java.util.Scanner;
import misFunciones.Geometria;
import misFunciones.Varias;

public class ejercicios9al15 {
    
    public static void main(String[] args){

        //decalración de variables
        int x;
        int y;
        String simbol;
        Scanner s = new Scanner(System.in);

        //Declaración de funciones
        System.out.print("Introduce un número ");
        x = s.nextInt();
        System.out.print("Introduce otro número ");
        y = s.nextInt();

        System.out.println("El mayor de los dos es el: " + misFunciones.Varias.selector(x, y));

        System.out.print("Coloque el número del que quiera hacer una tabla de multiplicar: ");
        x = s.nextInt();

        misFunciones.Varias.tablaMultiplica(x);

        System.out.print("Introduce la altura de tu piramide: ");
        x = s.nextInt();
        System.out.print("Introduzca el simbolo de la piramide: ");
        simbol = s.next();

        misFunciones.Geometria.piramide(x, simbol);

        System.out.println("Ahora el programa presentará la suma de un array aleatorio de los primeros 100 números naturales y su correspondiente media");

        System.out.println("La suma del array es: " + misFunciones.Varias.arraySuma());
        System.out.println("La media del array es: " + misFunciones.Varias.arrayMedia());


    }

}
