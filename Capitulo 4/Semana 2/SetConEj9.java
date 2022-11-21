import java.util.Scanner;

/*
* Este programa resuelve una ecuación de primer grado del tipo ax + b = 0.
*
* MiguelBlanco
*/
public class SetConEj9 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		double x;
		double y;
		
		System.out.println("Este programa puede resolver esta ecuacion de segundo grado: ax^2 + bx + c = 0");
		System.out.print("Introduce el valor que quieras que sea el a: ");
		a = s.nextInt();
		System.out.print("Introduce el valor que quieras que sea el b: ");
		b = s.nextInt();
		System.out.print("Introduce el valor que quieras que sea el c: ");
		c = s.nextInt();
		
		if( (a != 0) && ( b != 0) ){
			y = Math.sqrt ( ( (double)b * (double)b ) - (4 * (double)a * (double) c) );
			x = ( (double)b + (double)y )/2;
			System.out.printf("x = %.2f\n",x);
			x = ( (double)b - (double)y )/2;
			System.out.printf("Y x = %.2f\n",x);
		} 
		if ( ( a != 0 ) && ( b == 0 ) )  {
			x = Math.sqrt ( ( (double)c/(double)a) ); 
			System.out.printf("x = %.2f\n",x);
		}
		if ( ( a == 0 ) && ( b != 0 ) ) {
			x = (double)c/(double)b;
			System.out.printf("x = %.2f\n",x);
		}
		if ( ( a == 0 ) && ( b == 0 ) ){
			System.out.println("Lo siento pero es imposible calcularlo");
		}
	}
}
