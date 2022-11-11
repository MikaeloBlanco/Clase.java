import java.util.Scanner;


/*Este programa es de calcular la conversion de Megabytes a Kilobytes.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatEJ10{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int megaByte;
		int kiloByte;
		kiloByte = 1024;
		
		System.out.print("Coloque la cantidad de Megabytes que desee convertir: ");
		megaByte = s.nextInt();
		
		int conversor;
		conversor = megaByte * kiloByte;
		System.out.print("El total de Kilobytes es de: " + conversor );
		}
	}	 
