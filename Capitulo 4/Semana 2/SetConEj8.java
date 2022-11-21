import java.util.Scanner;

/*
* Este programa calcula la media de tres notas
*
* MiguelBlanco
*/
public class SetConEj8 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a;
		double b;
		double c;
		
		System.out.print("Diga la nota de tu primer examen ");
		a = s.nextDouble();
		
		System.out.print("Diga la nota de tu segundo examen ");
		b = s.nextDouble();
		
		System.out.print("Diga la nota de tu tercer examen ");
		c = s.nextDouble();
		
		double media;
		media = ( a + b + c ) / 3;
		System.out.printf("La media es de %.2f \n",media);
		if ( media >= 0 && media < 5) {
			System.out.println("La nota es insuficiente");
		}
		if ( media >=5 && media <= 6 ) {
			System.out.println("La nota es suficiente");
		}
		if ( media > 6 && media < 9) {
			System.out.println("La nota es notable");
		}
		if ( media >= 9 && media <= 10 ) {
			System.out.println("La nota es sobresaliente");
		}
		if ( ( media < 0 ) || ( media > 10 ) ) {
			System.out.println("Has escrito mal una o varias notas");
		}
	}
}
