import java.util.Scanner;

/*
* Este programa dice cuantas cifras hay de un número hasta un valor de 5 cifras en total.
*
* MiguelBlanco
*/
public class SetConEj19 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("Introduce un número: ");
		a = s.nextInt();
		
		int cont;
		cont = 0;
		
		if (a < 10 || a > -10 ){
			cont++;
		 } 
		if ( a >= 10 || a <= -10){
			cont++;
			}
		if ( a >= 100 || a <= -100 ){
			cont++;
		}
		if ( a >= 1000 || a <= -1000){
			cont++;
			}
		if ( ( a > 10000 ) && ( a < 100000 ) || ( a < -10000 ) && ( a > -100000 )  ){
			cont++;
		}
	 if ( ( a <= -100000 )  ||  ( a >= 100000 ) ){
		 System.out.println("Error en el sistema. Cerrando");
		 System.exit(0);
	 }
	 System.out.println("Tu número introducido tiene un total de: " + cont + " cifras");
		}
	}
