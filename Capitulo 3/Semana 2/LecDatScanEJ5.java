import java.util.Scanner;


/*Este programa es de calcular el area de un rectangulo.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatScanEJ5{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		 
		 double x;
		 double y;
		 
		System.out.print("Introduce la altura de su rectangulo: ");
		x = s.nextDouble();
		
		System.out.print("Introduce la base de su rectangulo: ");
		y = s.nextDouble();
		
		double calcArea;
		calcArea = x * y;
		System.out.printf("El resultado del area del rectangulo es de: %.3f ", calcArea);
	}
}
