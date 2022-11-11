import java.util.Scanner;


/*Este programa es de multiplicar dos numeros introducidos por teclado.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatScanEJ1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("Escribe un numero x: ");
		x = Integer.parseInt(s.nextLine());
		
		System.out.print("Escribe un numero y: ");
		y = Integer.parseInt(s.nextLine());
		
		int multiplicacion;
		multiplicacion = x * y;
		
		System.out.print("El resultado de la multiplicación de los dos números es de " + multiplicacion);
	}
}
