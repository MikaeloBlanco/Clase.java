import java.util.Scanner;


/*Este programa es de pasar de calculos simples usando los datos por pantalla.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatScanEJ4{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		 
		 double x;
		 double y;
		 
		 System.out.print("Escriba un número que desee calcular: ");
		 x = s.nextDouble();
		 
		 System.out.print("Escriba otro número que desee calcular: ");
		 y = s.nextDouble();
		 
		 int suma;
		 int resta;
		 double division;
		 int multiplicacion;
		 
		 suma = (int)x + (int)y;
		 resta = (int)x - (int)y;
		 division = x / y;
		 multiplicacion = (int)x * (int)y; 
		 System.out.printf("La suma de los dos numeros es de: " + suma + "\n");
		 System.out.printf("La resta de los dos números es de: " + resta + "\n");
		 System.out.printf("La multiplicación de los dos numeros es de: " + multiplicacion + "\n");
		 System.out.printf("Y la division de los dos numeros es de: %.3f ", division);
	}
}
