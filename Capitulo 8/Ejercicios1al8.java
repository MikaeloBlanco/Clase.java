import java.util.Scanner;
import misFunciones.Geometria;
import misFunciones.Varias;

/*
 * 
 * Comprobbación de los ejercicios del 1 hasta el 8 de la relación de ejercicios de Biblioteca de código
 * 
 * @author Miguel Blanco Fernández
 * 
 */


public class Ejercicios1al8{
    public static void main(String[] args) {
        

        double num;
        double num2;
        int n;

        double x;
        double h;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número de tu elección: ");
        num = s.nextDouble();

        System.out.print("Introduce otro número a tu elección: ");
        num2= s.nextDouble();

        System.out.println("El valor de su multiplicación es: " + misFunciones.Varias.multiplicacion(num,num2));
        System.out.println("Y el menor de los dos es: " + misFunciones.Varias.minimo(num, num2));
        
        System.out.print("introduce otro nuevo número: ");
        n = s.nextInt();

        if(misFunciones.Varias.dimeSigno(n) == 1){

            System.out.print("El número introducido es positivo: " + misFunciones.Varias.dimeSigno(n));
        
        } else if(misFunciones.Varias.dimeSigno(n) == 0){

            System.out.print("El número introducido es nulo(osea se 0): " + misFunciones.Varias.dimeSigno(n));

        } else {

            System.out.print("El número introducido es negativo: " + misFunciones.Varias.dimeSigno(n));

        }

        for(int o = 0; o < 3; o++){

            System.out.println();

        }

        System.out.println("Introduce la altura y el lado de un rectangulo: ");
        h = s.nextDouble();
        x = s.nextDouble();

        System.out.println("Esta es el perimetro del rectangulo: " + misFunciones.Geometria.perimetroRectangulo(x, h));
        System.out.println("Y aqui se encuentra su area: " + misFunciones.Geometria.areaRectangulo(x, h));

        
        for(int o = 0; o < 3; o++){

            System.out.println();

        }

        System.out.print("Por ultimo, introduce un número que quieras sea un rango de 1 a N: ");
        n = s.nextInt();

        System.out.println("La súma constante de números desde 1 hasta " + n + " es de: " + misFunciones.Varias.suma1aN(n));
        System.out.println("La multiplicación de números desde 1 hasta " + n + " es de: " + misFunciones.Varias.producto1aN(n));
        System.out.println("Y el intermedio de todos estos números es de " + misFunciones.Varias.intermedio1aN(n));

    }


}

