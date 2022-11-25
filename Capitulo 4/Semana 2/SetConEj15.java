import java.util.Scanner;

/*
* Este programa pinta por programa una piramide.
*
* MiguelBlanco
*/
public class SetConEj15 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a;
		
		System.out.print("Introduzca cualquier simbolo: ");
		a = s.next();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println(" BIENVENIDO AL MENÚ DE CREACIÓN DE PIRAMIDES ");
		System.out.println(" ------------------------------------------- ");
		System.out.println(" SELECCIONE UNA PIRAMIDE A SU ELECCIÓN:      ");
		System.out.println(" 1.ARRIBA ");
		System.out.println(" 2.ABAJO  ");
		System.out.println(" 3.DERECHA ");
		System.out.println(" 4.IZQUIERDA ");
		
		int x;
		x = s.nextInt();
		
		switch(x){
			case 1:
				System.out.println("  *  ");
				System.out.println(" *** ");
				System.out.println("*****");
				break;
			case 2:
				System.out.println("*****");
				System.out.println(" *** ");
				System.out.println("  *  ");
				break;
			case 3:
				System.out.println("*");
				System.out.println("**");
				System.out.println("***");
				System.out.println("**");
				System.out.println("*");
				break;
			case 4:
				System.out.println("  *");
				System.out.println(" **");
				System.out.println("***");
				System.out.println(" **");
				System.out.println("  *");
				break;
			default:
				System.out.println("Error en la introducción del sistema. Cerrando");
				System.exit(0);
			}
		}
	}
				
