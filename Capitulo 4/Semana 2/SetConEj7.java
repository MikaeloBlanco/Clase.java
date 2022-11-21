import java.util.Scanner;

/*
* Este programa calcula la media de tres notas
*
* MiguelBlanco
*/
public class SetConEj7 {
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
		System.out.printf("La media es de %.2f",media);
		}
	}
