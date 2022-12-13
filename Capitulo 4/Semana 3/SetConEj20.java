import java.util.Scanner;

/*
* Este programa dice cual es la primera cifra de un número hasta un valor de 5 cifras en total.
*
* MiguelBlanco
*/
public class SetConEj20 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("Introduce un número: ");
		a = s.nextInt();
		
		int cifraF;
		int cifraP;
		
		int cifraI;
		int cifraID; //Los nombres I e ID se refieren a Intermedia e Intermedia Dos
		
		
		
		
		if (a < 10 && a >= 0){
			System.out.println("Este número es capicua");
		 } 
		if ( a >= 10 && a < 100 ){
			cifraF = a % 10;
			cifraP = a / 10;
			
			if ( cifraF == cifraP ){
				System.out.println("Este número es capicua");
			} else {
				System.out.println("Este número es no capicua");
				}
			}
		if ( a >= 100 && a < 1000 ){
			cifraF = a % 10;
			cifraP = a / 10;
			
			if ( cifraF == cifraP ){
				System.out.println("Este número es capicua");
			} else {
				System.out.println("Este número es no capicua");
				}
			}
		if ( a >= 1000 && a < 10000 ){
			cifraF = a % 10;
			cifraP = a / 10;
			cifraI = cifraP % 10;
			cifraP = cifraP / 10;
			cifraID = cifraP % 10;
			cifraP = cifraP / 10;
			
			if ( cifraF == cifraP && cifraI == cifraID ){
				System.out.println("Este número es capicua");
			} else {
				System.out.println("Este número es no capicua");
				}
			}
		if ( a >= 10000 && a < 100000 ){
			cifraF = a % 10;
			cifraP = a / 10;
			cifraI = cifraP % 10;
			cifraP = cifraP / 100;
			cifraID = cifraP % 10;
			cifraP = cifraP / 10;

			if ( cifraF == cifraP && cifraI == cifraID ){
				System.out.println("Este número es capicua");
			} else {
				System.out.println("Este número es no capicua");
			}
		}
}
}
