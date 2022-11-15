import java.util.Scanner;

/*
* Este programa da los buenos dias, tardes o noches según la hora introducida.
*
* MiguelBlanco
*/
public class SetConEj2 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hora;
		System.out.print("¿Que hora es actualmente donde vives? ");
		hora = s.nextInt();
		
		if ( (hora >= 6) && (hora <= 12) ){
			System.out.println("Buenos Dias");
		} 
		if ( (hora >= 21) || (hora <= 5)) {
			System.out.println("Buenas Noches");
		} 
		if  ( ( hora >= 12) || !( hora <= 21) ) {
			System.out.println("Buenas Tardes");
			}
		}
	}
