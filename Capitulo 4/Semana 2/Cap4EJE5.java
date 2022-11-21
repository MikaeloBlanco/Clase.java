import java.util.Scanner;

/*
* Este programa calcula en una selección las areas de 4 figuras.
*
* MiguelBlanco
*/
public class Cap4EJE5 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println(" CÁLCULO DE ÁREAS");
		System.out.println(" ----------------");
		System.out.println(" 1. Triangulo");
		System.out.println(" 2. Rombo");
		System.out.println(" 3. Romboide");
		System.out.println(" 4. Trapecio");
		System.out.print("\n Elija una opción (1-4): ");
		
		int a;
		
		a = s.nextInt();
		
		double lado;
		double base;
		double altura;
		double dRombo;
		double dMayusRombo;
		double total;
		
		switch(a){
		case 1:
			System.out.print("Introduce la base del triangulo en cm: ");
			base = s.nextDouble();
			System.out.print("Introduce la altura del triangulo en cm: ");
			altura = s.nextDouble();
			total = ( base * altura ) / 2;
			System.out.print("El area del triangulo es de " + total + " cm2");
			break;
			
		case 2:
			System.out.print("Introduce la diagonal menor del rombo en cm: ");
			dRombo = s.nextDouble();
			System.out.print("Introduce la diagonal myor del rombo en cm: ");
			dMayusRombo = s.nextDouble();
			total = ( dRombo * dMayusRombo ) / 2;
			System.out.print("El area del rombo es de " + total + " cm2");
			break;
			
		case 3:
			System.out.print("Introduce la altura de tu romboide en cm: ");
			altura = s.nextDouble();
			System.out.print("Introduce la base de tu romboide en cm: ");
			base = s.nextDouble();
			total = base * altura;
			System.out.print("El area del romboide es de " + total + " cm2");
			break;
			
		case 4:
			System.out.print("Introduce la base menor de tu trapecio en cm: ");
			lado = s.nextDouble();
			System.out.print("Introduce la base mayor de tu trapecio en cm: ");
			base = s.nextDouble();
			System.out.print("Introduce la altura de tu trapecio en cm: ");
			altura = s.nextDouble();
			total = ( ( base + lado ) / 2 ) * altura;
			System.out.print("El area del trapecio es de " + total + " cm2");
			break;
			
		default:
			System.out.println("No existe dentro del rango de acción del programa");
			}
		}
	}
