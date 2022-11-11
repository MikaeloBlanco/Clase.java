import java.util.Scanner;


/*Este programa es de calcular el precio de un producto con iva.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatScanEJ7{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		 
		 double x;
		 double iva;
		 iva = 1.21;
		 
		System.out.print("Introduce el predio del producto que desea comprobar: ");
		x = s.nextDouble();
		
		double calcPrecio;
		calcPrecio = x * iva;
		System.out.printf("El resultado del area del rectangulo es de: %.2f Euros ", calcPrecio);
	}
}
