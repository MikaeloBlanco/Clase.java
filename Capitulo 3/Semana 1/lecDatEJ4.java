/*Este programa es de uso de la introduccion de datos para crear una calculadora simple.
*
* 
* Miguel Blanco Fernandez
*/
public class lecDatEJ4{
	public static void main(String[] args){
		String linea;
		 
		 double x;
		 double y;
		 
		 System.out.println("Escriba un número que desee calcular: ");
		 linea = System.console().readLine();
		 x = Double.parseDouble(linea);
		 
		 System.out.println("Escriba otro número que desee calcular: ");
		 linea = System.console().readLine();
		 y = Double.parseDouble(linea);
		 
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
		 System.out.printf("Y la division de los dos numeros es de: " + division);
	 }
 }
