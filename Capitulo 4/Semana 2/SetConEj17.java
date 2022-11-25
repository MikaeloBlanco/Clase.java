import java.util.Scanner;

/*
* Este programa dice cual es la ultima cifra de un número.
*
* MiguelBlanco
*/
public class SetConEj17 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("Introduce un número: ");
		a = s.nextInt();
		
		int cifraF;
		
		if ( a < 10 && a > -10){
		 System.out.println("El número introducido tiene la ultima cifra de " + a);
		 } else {
			cifraF = a % 10;
			System.out.println("El número introducido tiene la ultima cifra de " + cifraF);
			}
		}
	}
		
