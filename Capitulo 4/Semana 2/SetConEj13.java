import java.util.Scanner;

/*
* Este programa ordena tres números.
*
* MiguelBlanco
*/
public class SetConEj13 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Introduce tres numeros enteros de tu elección: ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		if ( a > b ){
			if ( b > c ) {
				System.out.println("El orden de los números es la siguiente: " + a + " " + b + " " + c);
			} else {
				System.out.println("El orden de los números es la siguiente: " + a + " " + c + " " + b);
			}
		}
		if ( c > a ){
			if ( a > b ){
				System.out.println("El orden de los números es la siguiente: " + c + " " + a + " " + b);
			} else {
				System.out.println("El orden de los números es la siguiente: " + c + " " + b + " " + a);
			}
		}
		if ( ( b > a ) && ( b > c ) ){
			if ( a > c ){
				System.out.println("El orden de los números es la siguiente: " + b + " " + a + " " + c);
			} 
			if ( c > a ) {
				System.out.println("El orden de los números es la siguiente: " + b + " " + c + " " + a);
			}
		}
	}
}
