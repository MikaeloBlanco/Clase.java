import java.util.Scanner;

/*
* Este programa calcula la nómina de un empleado.
*
* MiguelBlanco
*/
public class SetConEj25 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double alt;
		double ancho;
		String bordado;
		double tamañoBandera;
		double precioBandera;
		double total;
		double precBord;
		double gastosEnvio;
		bordado = "";
		precioBandera = 0;
		gastosEnvio = 3.25;
		precBord = 0;
		
		System.out.print("Introduzca la altura de la bandera en cm: ");
		alt = s.nextDouble();
		System.out.print("Introduzca la anchura: ");
		ancho = s.nextDouble();
		
		tamañoBandera = alt * ancho;
		precioBandera = tamañoBandera/100;
		
		tamañoBandera = (int)tamañoBandera;
		
		System.out.print("¿Desea tener un bordado en su escudo? (s/n): ");
		bordado = s.next();
		
		bordado = bordado.toLowerCase();
		
		switch(bordado){
			
			case "s":
				precBord = 2.50;
				bordado = " Con escudo";
				break;
			case "n":
				precBord = 0;
				bordado = " Sin escudo";
				break;
			
			}
			
		total = precBord + precioBandera + gastosEnvio;
		
		System.out.printf(" Bandera de %.0f cm2: 		",tamañoBandera);
		System.out.printf("%.2f euros \n",precioBandera);
		System.out.print(bordado + " 			");
		System.out.printf("%.2f euros \n",precBord);
		System.out.print(" Gastos de Envio: 		");
		System.out.printf("%.2f euros \n",gastosEnvio);
		System.out.println("---------------");
		System.out.print(" Total				");
		System.out.printf("%.2f euros \n",total);
	}
}
