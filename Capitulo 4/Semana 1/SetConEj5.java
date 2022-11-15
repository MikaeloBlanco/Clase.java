import java.util.Scanner;

/*
* Este programa resuelve una ecuación de primer grado del tipo ax + b = 0.
*
* MiguelBlanco
*/
public class SetConEj5 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		double x;
		
		System.out.println("Este programa puede resolver esta ecuacion de primer grado: ax + b = 0");
		System.out.print("Introduce el valor que quieras que sea el a: ");
		a = s.nextInt();
		System.out.print("Introduce el valor que quieras que sea el b: ");
		b = s.nextInt();
		
		if( a != 0){
			x = (double)a / (double)-b;
			System.out.printf("x = %.2f",x) ;
		} else {
			System.out.print("No es posible realizar la ecuación debido a que el valor a es 0");
			}
		}
	}
