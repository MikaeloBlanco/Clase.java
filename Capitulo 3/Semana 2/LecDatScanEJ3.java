import java.util.Scanner;


/*Este programa es de pasar de pesetas a euros.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatScanEJ3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double euro;
		euro = 0.006;
		
		System.out.print("Escriba el numero de pesetas que desee convertir a euros: ");
		double peseta;
		peseta = s.nextDouble();
		
		double conversor;
		conversor = euro * peseta;
		
		System.out.printf("El total de euros es de: %.2f ", conversor);
	}
}
