import java.util.Scanner;

/*
* Este programa calcula el tiempo restante antes de la medianoche en segundos.
*
* MiguelBlanco
*/
public class SetConEj11 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int hora;
		int minuto;
		int segMedianoche;
		
		System.out.print("Introduce la hora y minutos que son exactamente ahora: ");
		hora = s.nextInt();
		minuto = s.nextInt();
		
		segMedianoche = 24 * 3600;
		
		hora = hora * 3600;
		minuto = minuto * 60;
		
		int total;
		total = hora + minuto;
		total = segMedianoche - total;
		
		if ( total < 0 || total > 86400 ){
			System.out.println("Es imposible que la hora introducida sea menor a 0 o mayor a 86400 segundos");
		} else {
			System.out.println ("Los segundos restantes antes de la media noche son " + total);
		}
	}
}
