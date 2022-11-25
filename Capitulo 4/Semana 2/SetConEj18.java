import java.util.Scanner;

/*
* Este programa dice cual es la primera cifra de un número hasta un valor de 5 cifras en total.
*
* MiguelBlanco
*/
public class SetConEj18 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("Introduce un número: ");
		a = s.nextInt();
		
		int cifraP;
		
		if ( ( a < 10 ) && ( a > 0 ) || ( a > -10 ) && ( a < 0 ) ){
		 System.out.println("El número introducido tiene la primera cifra de " + a);
		 } 
		if ( ( a >= 10 ) && ( a < 100 ) || ( a <= -10 ) && ( a > -100 ) ){
			cifraP = a / 10;
			System.out.println("El número introducido tiene la primera cifra de " + cifraP);
			}
		if ( ( a >= 100 ) && ( a < 1000 ) || ( a <= -100 ) && ( a > -1000 )  ){
			cifraP = a / 100;
			System.out.println("El número introducido tiene la primera cifra de " + cifraP);
		}
		if ( ( a >= 1000 ) && ( a < 10000 ) || ( a <= -1000 ) && ( a > -10000 ) ){
			cifraP = a / 1000;
			System.out.println("El número introducido tiene la primera cifra de " + cifraP);
			}
		if ( ( a >= 10000 ) && ( a < 100000 ) || ( a <= -10000 ) && ( a > -100000 ) ){
			cifraP = a / 10000;
			System.out.println("El número introducido tiene la primera cifra de " + cifraP);
		}
	 if ( ( a <= -100000 )  ||  ( a >= 100000 ) ){
		 System.out.println("Error en el sistema. Cerrando");
		 System.exit(0);
	 }
		}
	}
