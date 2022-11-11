import java.util.Scanner;


/*Este programa es de pasar de pesetas a euros.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatScanEJ2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int peseta;
		peseta = 166;
		
		System.out.print("Escriba el numero de euros que desee convertir a pesetas: ");
		int euro;
		euro = s.nextInt();
		
		int conversor;
		conversor = euro * peseta;
		
		System.out.print("El total de pesetas es de: " + conversor);
	}
}
