import java.util.Scanner;


/*Este programa es de calcular la conversion de Kilobytes a Megabytes.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatEJ11{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double kiloByte;
		
		System.out.print("Coloque la cantidad de Kilobytes que desee convertir: ");
		kiloByte = s.nextDouble();
		
		double conversor;
		conversor = kiloByte/1024;
		System.out.printf("El total de Megabytes es de: %.2f ", conversor );
		}
	}	 
