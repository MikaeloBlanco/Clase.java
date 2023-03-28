import java.util.Scanner;
import misFunciones.Geometria;
import misFunciones.Varias;

public class ejercicios17al21 {
    public static void main(String[] args){

        //Declaración de variables
        int num;
        int x = 1;
        double r;
        Scanner s = new Scanner(System.in);

        //Declaracion de Funciones
        System.out.print("Introduce un número(menos el 2, 3, 5, y 7): ");
        num = s.nextInt();

        while(num != 0){
            misFunciones.Varias.Primo(num);
            System.out.print("Introduce un número(menos el 2, 3, 5, y 7)(Para salir coloque un 0): ");
		    num = s.nextInt();
        }
    
        System.out.print("Introduce tu DNI: ");
        num = s.nextInt();

        System.out.println("Para el DNI introducido, la letra seria la: " + misFunciones.Varias.DNI(num));

        System.out.println("Introduce un número para ver el menú");
        x = s.nextInt();
        misFunciones.Geometria.menu(x);

    }
    
}
