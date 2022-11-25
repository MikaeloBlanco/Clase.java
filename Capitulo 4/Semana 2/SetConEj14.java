import java.util.Scanner;

/*
* Este programa realiza una instrucción que permite detectar un número par y/o divisible por 5.
*
* MiguelBlanco
*/
public class SetConEj14 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("Introduce un número cualquiera: ");
		a = s.nextInt();
		
		int comprobacion;
		comprobacion = a % 10;
		
		
		
		if ( comprobacion == 0 || comprobacion == 2 || comprobacion == 4 || comprobacion == 6 || comprobacion == 8 ){
			System.out.println("El número es par");
		}
		if ( comprobacion == 0 || comprobacion == 5 ){
			System.out.println("El número es divisible entre 5");
		}
	}
}
		
		
